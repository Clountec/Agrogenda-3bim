package clountec.com.agrogenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import clountec.com.agrogenda.model.Doenca;
import clountec.com.agrogenda.repository.DoencaRepository;

@RestController
@RequestMapping("/api/doenca")
public class DoencaController {

    @Autowired
    private DoencaRepository doencaRepository;

    @PostMapping
    public ResponseEntity<Doenca> saveDoenca(@RequestBody Doenca doenca) {
        Doenca doencaSalva = doencaRepository.save(doenca);
        return new ResponseEntity<>(doencaSalva, HttpStatus.CREATED);
    }

}
