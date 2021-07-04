package com.digitalinnovation.bootcamp.aulaapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Materia {

    LOGICA("Logica de Programação"),
    DATABASE("Banco de Dados"),
    JAVA("Java"),
    SPRING("Spring"),
    REST("Arquitetura REST");

    private final String materia;
}
