package clountec.com.agrogenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agricultor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgricultor;
    private String nomeAgricultor;
    private String senha;
    
    public Agricultor() {
    }
    
    public Agricultor(Long idAgricultor, String nomeAgricultor, String senha) {
        this.idAgricultor = idAgricultor;
        this.nomeAgricultor = nomeAgricultor;
        this.senha = senha;
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

    public Long getIdAgricultor() {
        return idAgricultor;
    }

    public void setIdAgricultor(Long idAgricultor) {
        this.idAgricultor = idAgricultor;
    }
}
