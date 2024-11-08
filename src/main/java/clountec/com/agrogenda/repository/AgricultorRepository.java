package clountec.com.agrogenda.repository;

import org.springframework.data.repository.CrudRepository;
import clountec.com.agrogenda.model.Agricultor;

public interface AgricultorRepository extends CrudRepository<Agricultor,Long> {
    
}
