package clountec.com.agrogenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plantio {
    private String nomePlantio;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Plantio() {
    }

    public String getNomePlantio() {
        return nomePlantio;
    }

    public void setNomePlantio(String nomePlantio) {
        this.nomePlantio = nomePlantio;
    }

    
}
