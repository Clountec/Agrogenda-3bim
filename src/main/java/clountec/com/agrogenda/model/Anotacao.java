package clountec.com.agrogenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Anotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnotacao;
    private String dataAnotacao;
    private String produto;
    private String doenca;
    private String dosagem;
    private String observacao;

    public Anotacao() {
    }

    public Anotacao(String dataAnotacao, String produto, String doenca, String dosagem, String observacao) {
        this.dataAnotacao = dataAnotacao;
        this.produto = produto;
        this.doenca = doenca;
        this.dosagem = dosagem;
        this.observacao = observacao;
    }

    public Long getIdAgnotacao() {
        return idAnotacao;
    }

    public void setIdAgnotacao(Long idAgnotacao) {
        this.idAnotacao = idAgnotacao;
    }

    public String getDataAnotacao() {
        return dataAnotacao;
    }

    public void setDataAnotacao(String dataAnotacao) {
        this.dataAnotacao = dataAnotacao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
}
