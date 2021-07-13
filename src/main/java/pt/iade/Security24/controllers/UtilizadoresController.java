package pt.iade.Security24.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Security24.models.Utilizador;
import pt.iade.Security24.models.repositories.UtilizadoresRepository;

@RestController
@RequestMapping(path = "/api/Utilizador")

public class UtilizadoresController {
    
    public org.slf4j.Logger logger = LoggerFactory.getLogger(UtilizadoresController.class);
    @Autowired
    public UtilizadoresRepository utilizadoresRepository;

    public UtilizadoresController(org.slf4j.Logger logger, UtilizadoresRepository utilizadoresRepository) {
        this.logger = logger;
        this.utilizadoresRepository = utilizadoresRepository;
    }

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> getUtilizador(UtilizadoresRepository utilizadoresRepository) {
        logger.info("A enviar todos os utilizadores");
        return utilizadoresRepository.findAll();
    }
}