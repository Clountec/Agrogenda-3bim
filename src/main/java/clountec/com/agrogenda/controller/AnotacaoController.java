package clountec.com.agrogenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import clountec.com.agrogenda.model.Anotacao;
import clountec.com.agrogenda.repository.AnotacaoRepository;

@RestController
@RequestMapping("/api/anotacao")
public class AnotacaoController {

    @Autowired
    private AnotacaoRepository anotacaoRepository;

    @PostMapping
    public ResponseEntity<Anotacao> saveAnotacao(@RequestBody Anotacao anotacao) {
        Anotacao anotacaoSalva = anotacaoRepository.save(anotacao);
        return new ResponseEntity<>(anotacaoSalva, HttpStatus.CREATED);
    }

}