package clountec.com.agrogenda.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private String nomeTecnico;
    private String nomeComercial;
    private String tipo;
    private String doseRecomendada;
    
    public Produto() {
    }

    public Produto(Long idProduto, String nomeTecnico, String nomeComercial, String tipo, String doseRecomendada) {
        this.idProduto = idProduto;
        this.nomeTecnico = nomeTecnico;
        this.nomeComercial = nomeComercial;
        this.tipo = tipo;
        this.doseRecomendada = doseRecomendada;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDoseRecomendada() {
        return doseRecomendada;
    }

    public void setDoseRecomendada(String doseRecomendada) {
        this.doseRecomendada = doseRecomendada;
    }
}
