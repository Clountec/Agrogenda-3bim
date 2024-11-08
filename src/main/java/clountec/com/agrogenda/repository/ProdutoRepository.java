package clountec.com.agrogenda.repository;

import org.springframework.data.repository.CrudRepository;
import clountec.com.agrogenda.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto,Long> {
    
}
