package clountec.com.agrogenda.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Doenca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoenca;
    private String nomeDoenca;
    private String descricaoDoenca;

    public Doenca() {
    }

    public Doenca(Long idDoenca, String nomeDoenca, String descricaoDoenca) {
        this.idDoenca = idDoenca;
        this.nomeDoenca = nomeDoenca;
        this.descricaoDoenca = descricaoDoenca;
    }

    public Long getIdDoenca() {
        return idDoenca;
    }

    public void setIdDoenca(Long idDoenca) {
        this.idDoenca = idDoenca;
    }

    public String getNomeDoenca() {
        return nomeDoenca;
    }

    public void setNomeDoenca(String nomeDoenca) {
        this.nomeDoenca = nomeDoenca;
    }

    public String getDescricaoDoenca() {
        return descricaoDoenca;
    }

    public void setDescricaoDoenca(String descricaoDoenca) {
        this.descricaoDoenca = descricaoDoenca;
    }
    
}
