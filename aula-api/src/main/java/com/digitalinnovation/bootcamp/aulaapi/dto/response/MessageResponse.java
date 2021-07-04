package com.digitalinnovation.bootcamp.aulaapi.dto.response;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class MessageResponse {

    private String message;
}
