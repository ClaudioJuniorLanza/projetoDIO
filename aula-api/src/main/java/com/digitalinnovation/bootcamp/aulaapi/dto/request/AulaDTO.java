package com.digitalinnovation.bootcamp.aulaapi.dto.request;

import com.digitalinnovation.bootcamp.aulaapi.enums.Materia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AulaDTO {

    private Long id;

    @NotEmpty
    private String titulo;

    @Enumerated(EnumType.STRING)
    private Materia materia;

    @NotNull
    private String data;

    @Valid
    @NotEmpty
    private List<TarefaDTO> tarefas;

}
