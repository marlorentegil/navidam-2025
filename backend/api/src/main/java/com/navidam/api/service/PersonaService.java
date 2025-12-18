package com.navidam.api.service;

import com.navidam.api.dto.request.PersonaRequest;
import com.navidam.api.dto.response.PersonaResponse;

import java.util.List;

public interface PersonaService {

    public List<PersonaResponse> listarPersonas();

    PersonaResponse crearPersona(PersonaRequest request);

    void eliminarPersona(Long id);
}


