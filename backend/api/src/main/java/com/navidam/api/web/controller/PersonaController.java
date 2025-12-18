package com.navidam.api.web.controller;

import com.navidam.api.dto.request.PersonaRequest;
import com.navidam.api.dto.response.PersonaResponse;
import com.navidam.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    @ResponseStatus(HttpStatus.OK)
    public List<PersonaResponse> listarPersonas(){
        return this.personaService.listarPersonas();
    }

    @PostMapping("/personas")
    @ResponseStatus(HttpStatus.CREATED)
    PersonaResponse crearPersona(@RequestBody PersonaRequest request){
        return this.personaService.crearPersona(request);
    }

    @DeleteMapping("/personas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void eliminarPersona(Long id){
        this.personaService.eliminarPersona(id);
    }

}



