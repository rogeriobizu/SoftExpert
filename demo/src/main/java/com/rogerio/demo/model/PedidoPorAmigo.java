package com.rogerio.demo.model;

public class PedidoPorAmigo {
    /**Valor total do pedido de cada amigo */
    private String nome;
    private double valor;

    public PedidoPorAmigo(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}