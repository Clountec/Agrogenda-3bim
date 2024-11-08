package clountec.com.agrogenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import clountec.com.agrogenda.model.Plantio;
import clountec.com.agrogenda.repository.PlantioRepository;

@RestController
@RequestMapping("/api/plantio")
public class PlantioController {

    @Autowired
    private PlantioRepository plantioRepository;

    @PostMapping
    public ResponseEntity<Plantio> savePlantio(@RequestBody Plantio plantio) {
        Plantio plantioSalvo = plantioRepository.save(plantio);
        return new ResponseEntity<>(plantioSalvo, HttpStatus.CREATED);
    }

}
