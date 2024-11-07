package clountec.com.agrogenda.controller;

import org.springframework.web.bind.annotation.RestController;

import clountec.com.agrogenda.model.Plantio;
import clountec.com.agrogenda.repository.PlantioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PlantioController {
    @Autowired
    PlantioRepository plantioRepository;

    @PostMapping("plantio")
    public Plantio postMethodName(@RequestBody Plantio entity) {
        Plantio plantioSalvo = plantioRepository.save(entity);

        return plantioSalvo;
    }
    
}
