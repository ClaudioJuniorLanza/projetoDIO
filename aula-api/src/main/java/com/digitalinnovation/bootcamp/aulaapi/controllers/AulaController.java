package com.digitalinnovation.bootcamp.aulaapi.controllers;

import com.digitalinnovation.bootcamp.aulaapi.dto.request.AulaDTO;
import com.digitalinnovation.bootcamp.aulaapi.dto.response.MessageResponse;
import com.digitalinnovation.bootcamp.aulaapi.exceptions.AulaNotFoundException;
import com.digitalinnovation.bootcamp.aulaapi.services.AulaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/aula")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AulaController {

    private final AulaService aulaService;

    @GetMapping
    public List<AulaDTO> getAll(){
        return aulaService.findAll();
    }

    @GetMapping("/{id}")
    public AulaDTO getId(@PathVariable Long id) throws AulaNotFoundException {
        return aulaService.getId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponse create (@Valid @RequestBody AulaDTO aulaDTO){
        return aulaService.create(aulaDTO);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponse update(@PathVariable Long id, @RequestBody AulaDTO aulaDTO) throws AulaNotFoundException {
        return aulaService.update(id, aulaDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws AulaNotFoundException {
        aulaService.delete(id);
    }

}
