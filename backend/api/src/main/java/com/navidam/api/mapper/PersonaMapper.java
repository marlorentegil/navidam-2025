package com.navidam.api.mapper;

import com.navidam.api.dto.request.PersonaRequest;
import com.navidam.api.dto.response.PersonaResponse;
import com.navidam.api.jpa.entity.PersonaEntity;

public class PersonaMapper {

    public static PersonaResponse personaEntityToPersonaResponse(PersonaEntity e) {
        return new PersonaResponse(
                e.getId(),
                e.getNombre(),
                e.getEmail()
        );
    }


    public static PersonaEntity personaRequestToPersonaEntity(PersonaRequest request) {
        return new PersonaEntity(
                null,
                request.nombre(),
                request.email()
        );
    }

}
