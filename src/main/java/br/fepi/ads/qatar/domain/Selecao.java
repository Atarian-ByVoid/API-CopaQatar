package br.fepi.ads.qatar.domain;

import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity

public class Selecao {

	@JsonInclude(Include.NON_NULL)
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

	@JsonInclude(Include.NON_NULL)
    private boolean favorita;

    @JsonInclude(Include.NON_NULL)
    private String cor_camisa_secundaria;

    @JsonInclude(Include.NON_NULL)
    private String cor_camisa_principal;

    @JsonInclude(Include.NON_NULL)
    private Integer numero_copas;

    public Selecao(){

    }

    // id das camisetas
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    // cor da camiseta princial
    public String getCor_camisa_principal() {
        return cor_camisa_principal;
    }

    public void setCor_camisa_principal(String cor_camisa_principal) {
        this.cor_camisa_principal = cor_camisa_principal;

    }

    // cor camiseta secundaria
    public String getCor_camisa_secundaria() {
        return cor_camisa_secundaria;

    }

    public void setCor_camisa_secundaria(String cor_camisa_secundaria) {
        this.cor_camisa_secundaria = cor_camisa_secundaria;
    }

    // camiseta favorita
    public boolean getFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    // numero das copas
    public Integer getNumero_copas() {
        return numero_copas;
    }

    public void setNumero_copas(Integer numero_copas) {
        this.numero_copas = numero_copas;
    }

}
