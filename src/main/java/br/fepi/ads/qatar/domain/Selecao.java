package br.fepi.ads.qatar.domain;

import java.sql.Date;

public class selecao {

    private Long id;
    private boolean favorita;
    private String cor_camisa_secundaria;
    private String cor_camisa_principal;
    private integer numero_copas;

    // id das camisetas 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    //cor da camiseta princial
    public String setCor_camisa_principal() {
        return cor_camisa_principal;
    }

    public void setCor_camisa_principal(String cor_camisa_principal){
     this.cor_camisa_principal = cor_camisa_principal;

    }

    //cor camiseta secundaria
    public String setCor_camisa_secundaria(){
        return cor_camisa_secundaria;

    }

    public void setCor_camisa_secundaria(String cor_camisa_secundaria){
        this.cor_camisa_secundaria = cor_camisa_secundaria;
    }

    //camiseta favorita 
    public boolean setFavorita(){
        return favorita;
    }

    public void setFavorita(boolean favorita){
    this.favorita = favorita;
    }

    //numero das copas 

    public integer setNumero_copas(){
        return numero_copas;
    }

    public void setNumero_copas(integer numero_copas){
        this.numero_copas=numero_copas;
    }
    



    }
}
