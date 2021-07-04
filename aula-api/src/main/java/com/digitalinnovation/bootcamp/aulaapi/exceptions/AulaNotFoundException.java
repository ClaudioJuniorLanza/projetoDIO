package com.digitalinnovation.bootcamp.aulaapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AulaNotFoundException extends Exception {

    public AulaNotFoundException(Long id) {
        super(String.format("Aula with ID %s not found!", id));
    }
}
