package clountec.com.agrogenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Plantio {
    private String nomePlantio;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlantio;
    
    private String dataInicio;
    private String dataColheita;
    private String hectares;

    //Relacionamento Muitos-para-Um com Agricultor
    @ManyToOne
    @JoinColumn(name = "idAgricultor")
    private Agricultor agricultor;

    public Plantio() {
    }

    public Plantio(String nomePlantio, Long idPlantio, String dataInicio, String dataColheita, String hectares,
                   Agricultor agricultor) {
        this.nomePlantio = nomePlantio;
        this.idPlantio = idPlantio;
        this.dataInicio = dataInicio;
        this.dataColheita = dataColheita;
        this.hectares = hectares;
        this.agricultor = agricultor;
    }

    public String getNomePlantio() {
        return nomePlantio;
    }

    public void setNomePlantio(String nomePlantio) {
        this.nomePlantio = nomePlantio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataColheita() {
        return dataColheita;
    }

    public void setDataColheita(String dataColheita) {
        this.dataColheita = dataColheita;
    }

    public String getHectares() {
        return hectares;
    }

    public void setHectares(String hectares) {
        this.hectares = hectares;
    }

    public Agricultor getAgricultor() {
        return agricultor;
    }

    public void setAgricultor(Agricultor agricultor) {
        this.agricultor = agricultor;
    }

    public Long getIdPlantio() {
        return idPlantio;
    }

    public void setIdPlantio(Long idPlantio) {
        this.idPlantio = idPlantio;
    }
}