package clountec.com.agrogenda.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Agricultor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgricultor;
    private String nomeAgricultor;
    private String senha;

    // Relacionamento Um-para-Muitos com Plantio
    @OneToMany(mappedBy = "agricultor", cascade = CascadeType.ALL)
    private List<Plantio> plantios;

    public Agricultor() {
    }

    public Agricultor(Long idAgricultor, String nomeAgricultor, String senha, List<Plantio> plantios) {
        this.idAgricultor = idAgricultor;
        this.nomeAgricultor = nomeAgricultor;
        this.senha = senha;
        this.plantios = plantios;
    }

    public List<Plantio> getPlantios() {
        return plantios;
    }

    public void setPlantios(List<Plantio> plantios) {
        this.plantios = plantios;
    }

    public Long getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(Long idAgricultor) {
        this.idAgricultor = idAgricultor;
    }

    public String getNomeAgricultor() {
        return nomeAgricultor;
    }

    public void setNomeAgricultor(String nomeAgricultor) {
        this.nomeAgricultor = nomeAgricultor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
