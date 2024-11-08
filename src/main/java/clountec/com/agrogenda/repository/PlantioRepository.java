package clountec.com.agrogenda.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import clountec.com.agrogenda.model.Plantio;

public interface PlantioRepository extends CrudRepository<Plantio,Long>{
    List<Plantio> findByAgricultorId(Long agricultorId);
}
