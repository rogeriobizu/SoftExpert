package com.rogerio.demo.model;

import java.util.List;

public class Pedido {
    private List<PedidoPorAmigo> pedidos;
    private double entrega;
    private double desconto;
    private double acrescimoPercentual;


    public double valorTotal() {
        double totalPedido = 0.0;

        for (PedidoPorAmigo item : this.pedidos) {
            totalPedido += item.getValor();
        }

        double totalComAcrescimo = totalPedido * (1 + (acrescimoPercentual / 100));
        double totalComEntrega = totalComAcrescimo + entrega;
        double totalPagar = totalComEntrega - desconto;

        return totalPagar;
    }

    public double valorTotalSemDesconto() {
        double totalPedido = 0.0;

        for (PedidoPorAmigo item : this.pedidos) {
            totalPedido += item.getValor();
        }

        double totalComAcrescimo = totalPedido * (1 + (acrescimoPercentual / 100));
        double totalComEntrega = totalComAcrescimo;

        return totalComEntrega;
    }

    // Getters e Setters

    public List<PedidoPorAmigo> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoPorAmigo> pedidos) {
        this.pedidos = pedidos;
    }

    public double getEntrega() {
        return entrega;
    }

    public void setEntrega(double entrega) {
        this.entrega = entrega;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getAcrescimoPercentual() {
        return acrescimoPercentual;
    }

    public void setAcrescimoPercentual(double acrescimoPercentual) {
        this.acrescimoPercentual = acrescimoPercentual;
    }
}
