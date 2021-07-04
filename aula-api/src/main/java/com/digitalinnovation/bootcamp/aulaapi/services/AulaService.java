package com.digitalinnovation.bootcamp.aulaapi.services;

import com.digitalinnovation.bootcamp.aulaapi.dto.mapper.AulaMapper;
import com.digitalinnovation.bootcamp.aulaapi.dto.request.AulaDTO;
import com.digitalinnovation.bootcamp.aulaapi.dto.response.MessageResponse;
import com.digitalinnovation.bootcamp.aulaapi.entities.Aula;
import com.digitalinnovation.bootcamp.aulaapi.exceptions.AulaNotFoundException;
import com.digitalinnovation.bootcamp.aulaapi.repository.AulaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AulaService {

    private final AulaRepository aulaRepository;

    private final AulaMapper aulaMapper;

    public MessageResponse create(AulaDTO aulaDTO) {

        Aula aula = aulaMapper.toModel(aulaDTO);
        Aula savedAula = aulaRepository.save(aula);

        MessageResponse message = createMesageResponse("Aula criada com sucesso. ID: ", savedAula.getId());
            return message;
        }

    public List<AulaDTO> findAll() {
        List<Aula> aula = aulaRepository.findAll();
        return aula.stream()
                .map(aulaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AulaDTO getId(Long id) throws AulaNotFoundException {
        Aula aula = verifyIfExists(id);
        return aulaMapper.toDTO(aula);
    }

    public void delete(Long id) throws AulaNotFoundException {
        verifyIfExists(id);
        aulaRepository.deleteById(id);
    }

    private MessageResponse createMesageResponse(String s, Long id) {
        return MessageResponse.builder()
                .message(s + id)
                .build();
    }

    private Aula verifyIfExists(Long id) throws AulaNotFoundException {
        return aulaRepository.findById(id)
                    .orElseThrow(() -> new AulaNotFoundException(id));
    }


}

