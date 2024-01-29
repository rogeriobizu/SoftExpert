package com.rogerio.demo.services;

import com.rogerio.demo.model.AmigoResultado;
import com.rogerio.demo.model.Pedido;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalculaValorPagarPorAmigo {

    protected static List<AmigoResultado> calcularTotalPagarPorAmigo(Map<String, Double> proporcoes, Pedido pedido) {

        List<AmigoResultado> amigosResultados = new ArrayList<>();

        for (Map.Entry<String, Double> proporcao : proporcoes.entrySet()) {
            double valorProporcional = proporcao.getValue() * pedido.valorTotal();
            AmigoResultado resultado = new AmigoResultado(proporcao.getKey(),arredondar(valorProporcional));
            amigosResultados.add(resultado);
        }
        return amigosResultados;
    }

    private static double arredondar(double valorProporcional) {
        return Math.round(valorProporcional * 100.0)/100.0;
    }

}
