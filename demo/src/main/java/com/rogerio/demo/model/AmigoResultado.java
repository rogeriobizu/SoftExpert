package com.rogerio.demo.model;

public class AmigoResultado {
    /**Valor a pagar por cada amigo*/
    private String nome;
    private double valorPagar;

    public AmigoResultado(String nome, double valorPagar) {
        this.nome = nome;
        this.valorPagar = valorPagar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
}