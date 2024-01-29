package com.rogerio.demo.services;

import com.rogerio.demo.model.PedidoPorAmigo;
import com.rogerio.demo.model.Pedido;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CalculaProporcaoQueCadaAmigoDevePagarTest {

    @Test
    public void testCalcularProporcoes() {

        Pedido pedidoMock = Mockito.mock(Pedido.class);
        when(pedidoMock.valorTotalSemDesconto()).thenReturn(50.0);

        List<PedidoPorAmigo> pedidos = criarPedidos();
        when(pedidoMock.getPedidos()).thenReturn(pedidos);

        // Executar o método calcularProporcoes
        Map<String, Double> proporcoes = CalculaProporcaoQueCadaAmigoDevePagar.calcularProporcoes(pedidoMock);

        assertEquals(2, proporcoes.size());
        assertEquals(0.8, proporcoes.get("Joao"), 0.01);
        assertEquals(0.16, proporcoes.get("Maria"), 0.01);
    }

    private List<PedidoPorAmigo> criarPedidos() {
        PedidoPorAmigo joao = new PedidoPorAmigo("Joao", 40.0);
        PedidoPorAmigo maria = new PedidoPorAmigo("Maria", 8.0);
        return List.of(joao, maria);
    }
}
