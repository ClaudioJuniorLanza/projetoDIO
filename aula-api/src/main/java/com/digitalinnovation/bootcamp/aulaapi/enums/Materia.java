package com.digitalinnovation.bootcamp.aulaapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Materia {

    PORTUGUES("Portugues"),
    MATEMATICA("Matemática"),
    HISTORIA("História"),
    GEOGRAFIA("Geografia"),
    CIENCIAS("Ciências");

    private final String materia;
}
