package com.digitalinnovation.bootcamp.aulaapi.controllers;

import com.digitalinnovation.bootcamp.aulaapi.dto.request.AulaDTO;
import com.digitalinnovation.bootcamp.aulaapi.dto.response.MessageResponse;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponse create (@Valid @RequestBody AulaDTO aulaDTO){
        return aulaService.create(aulaDTO);
    }



}
