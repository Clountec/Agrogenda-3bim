package clountec.com.agrogenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import clountec.com.agrogenda.model.Produto;
import clountec.com.agrogenda.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<Produto> saveProduto(@RequestBody Produto produto) {
        Produto produtoSalvo = produtoRepository.save(produto);
        return new ResponseEntity<>(produtoSalvo, HttpStatus.CREATED);
    }
}
