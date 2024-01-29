package com.rogerio.demo.services;

import com.rogerio.demo.model.AmigoResultado;
import com.rogerio.demo.model.Pedido;
import com.rogerio.demo.services.CalculaValorPagarPorAmigo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class CalculaValorPagarPorAmigoTest {

    @Test
    public void testCalcularTotalPagarPorAmigo() {
        // Criar mocks
        Pedido pedidoMock = Mockito.mock(Pedido.class);

        // Configurar comportamento dos mocks
        when(pedidoMock.valorTotal()).thenReturn(50.0);

        // Configurar as proporções esperadas
        Map<String, Double> proporcoesEsperadas = new HashMap<>();
        proporcoesEsperadas.put("Amigo1", 0.2);
        proporcoesEsperadas.put("Amigo2", 0.8);

        // Executar o método que está sendo testado
        List<AmigoResultado> amigosResultados = CalculaValorPagarPorAmigo.calcularTotalPagarPorAmigo(proporcoesEsperadas, pedidoMock);

        // Verificar o resultado esperado
        assertEquals(2, amigosResultados.size());

        // Verificar os valores individuais
        assertEquals("Amigo1", amigosResultados.get(0).getNome());
        assertEquals(10.0, amigosResultados.get(0).getValorPagar());

        assertEquals("Amigo2", amigosResultados.get(1).getNome());
        assertEquals(40.0, amigosResultados.get(1).getValorPagar());
    }
}
