package pt.iade.Security24.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Security24.models.Administrador;
import pt.iade.Security24.models.repositories.AdministradorRepository;

@RestController
@RequestMapping(path = "/api/Administrador")

public class AdministradorController {
    
    public org.slf4j.Logger logger = LoggerFactory.getLogger(AdministradorController.class);
    @Autowired
    public AdministradorRepository administradorRepository;

    public AdministradorController(org.slf4j.Logger logger, AdministradorRepository administradorRepository) {
        this.logger = logger;
        this.administradorRepository = administradorRepository;
    }

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Administrador> getAdministrador(AdministradorRepository administradorRepository) {
        logger.info("A enviar o administrador");
        return administradorRepository.findAll();
    }
}