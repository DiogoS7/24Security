package pt.iade.Security24.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.Security24.models.Planos;
import pt.iade.Security24.models.repositories.PlanosRepository;

@RestController
@RequestMapping(path = "/api/Planos")

public class PlanosController {
    
    public org.slf4j.Logger logger = LoggerFactory.getLogger(PlanosController.class);
    @Autowired
    public PlanosRepository planosRepository;

    public PlanosController(org.slf4j.Logger logger, PlanosRepository planosRepository) {
        this.logger = logger;
        this.planosRepository = planosRepository;
    }

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Planos> getPlanos(PlanosRepository planosRepository) {
        logger.info("A enviar todos os planos");
        return planosRepository.findAll() ;
    }
}