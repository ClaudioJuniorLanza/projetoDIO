package com.digitalinnovation.bootcamp.aulaapi.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TarefaDTO {

    private Long id;
    @NotEmpty
    private String titulo;
    @NotEmpty
    private String descricao;
}
