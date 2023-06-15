package com.br.foliveira.lojaACME.model;

import java.math.BigDecimal;
import java.nio.file.Path;

public class Produto {
    
    private String nome;
    private Path file;
    private BigDecimal preco;

    public Produto(String nome, Path file, BigDecimal preco){
        this.nome = nome;
        this.file = file;
        this.preco = preco;
    }

    public Produto(){}

    public String getNome(){return this.nome;}

    public Path getFile(){return this.file;}

    public BigDecimal getPreco(){return this.preco;}

    public void setPreco(BigDecimal preco){this.preco = preco;}

}
