package com.rogerio.demo.services;
import com.rogerio.demo.model.PedidoPorAmigo;
import com.rogerio.demo.model.Pedido;
import com.rogerio.demo.model.ResultadoCalculo;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraContaServiceTest {

    @Test
    public void testCalcularConta() {
        // Cenário de teste
        PedidoPorAmigo Joao = new PedidoPorAmigo("Joao", 42.0);
        PedidoPorAmigo Maria = new PedidoPorAmigo("Maria", 8.0);

        List<PedidoPorAmigo> pedidos = Arrays.asList(Joao, Maria);

        Pedido pedido = new Pedido();
        pedido.setPedidos(pedidos);
        pedido.setEntrega(8.0);
        pedido.setDesconto(20.0);
        pedido.setAcrescimoPercentual(0.0);

        // Executar o método calcular
        ResultadoCalculo resultadoCalculo = CalculaResultadoParaTodos.calcular(pedido);

        // resultado esperado
        assertEquals(38.0, pedido.valorTotal(), 0.01);

        // Exemplo: Verificar valores individuais
        assertEquals(31.92, resultadoCalculo.getAmigosResultados().get(0).getValorPagar());
        assertEquals(6.08, resultadoCalculo.getAmigosResultados().get(1).getValorPagar());
    }
}
