package com.rogerio.demo.services;

import com.rogerio.demo.model.PedidoPorAmigo;
import com.rogerio.demo.model.Pedido;
import java.util.HashMap;
import java.util.Map;

public class CalculaProporcaoQueCadaAmigoDevePagar {

    /** Calcula a proporção do valor de cada item em relação ao total do pedido*/
    protected static Map<String, Double> calcularProporcoes(Pedido pedido) {
        Map<String, Double> proporcoes = new HashMap<>();
        for (PedidoPorAmigo item : pedido.getPedidos()) {
            double proporcao = item.getValor() / pedido.valorTotalSemDesconto();
            proporcoes.put(item.getNome(), proporcao);
        }
        return proporcoes;
    }

}
