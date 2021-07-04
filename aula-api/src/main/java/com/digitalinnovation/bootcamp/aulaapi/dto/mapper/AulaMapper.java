package com.digitalinnovation.bootcamp.aulaapi.dto.mapper;

import com.digitalinnovation.bootcamp.aulaapi.dto.request.AulaDTO;
import com.digitalinnovation.bootcamp.aulaapi.entities.Aula;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AulaMapper {

    @Mapping(target = "data", source = "data", dateFormat = "dd-MM-yyyy")
    Aula toModel(AulaDTO dto);

    AulaDTO toDTO(Aula dto);

}
