package com.rogerio.demo.services;

import com.rogerio.demo.model.Pedido;
import com.rogerio.demo.model.ResultadoCalculo;
import java.util.Map;
import static com.rogerio.demo.services.CalculaProporcaoQueCadaAmigoDevePagar.calcularProporcoes;
import static com.rogerio.demo.services.CalculaValorPagarPorAmigo.calcularTotalPagarPorAmigo;

public class CalculaResultadoParaTodos {
    public static ResultadoCalculo calcular(Pedido pedido) {
        return resultadoDoCalculo(pedido);
    }

    private static ResultadoCalculo resultadoDoCalculo(Pedido pedido) {
        
        Map<String, Double> proporcoes = calcularProporcoes(pedido);
        return new ResultadoCalculo(calcularTotalPagarPorAmigo(proporcoes, pedido));
        
    }

}


