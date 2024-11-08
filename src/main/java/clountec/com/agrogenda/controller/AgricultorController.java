import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import clountec.com.agrogenda.model.Agricultor;
import clountec.com.agrogenda.repository.AgricultorRepository;

import java.util.List;

@RestController
@RequestMapping("/api/agricultores")
public class AgricultorController {

    @Autowired
    private AgricultorRepository agricultorRepository;

    @GetMapping
    public List<Agricultor> listarAgricultores() {
        return (List<Agricultor>) agricultorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agricultor> buscarAgricultor(@PathVariable Long id) {
        return agricultorRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Agricultor criarAgricultor(@RequestBody Agricultor agricultor) {
        return agricultorRepository.save(agricultor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Agricultor> atualizarAgricultor(@PathVariable Long id, @RequestBody Agricultor agricultorAtualizado) {
        return agricultorRepository.findById(id)
                .map(agricultor -> {
                    agricultor.setNomeAgricultor(agricultorAtualizado.getNomeAgricultor());
                    agricultor.setSenha(agricultorAtualizado.getSenha());
                    Agricultor atualizado = agricultorRepository.save(agricultor);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerAgricultor(@PathVariable Long id) {
        if (agricultorRepository.existsById(id)) {
            agricultorRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
