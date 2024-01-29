
package com.rogerio.demo.controller;

import com.rogerio.demo.model.ResultadoCalculo;
import com.rogerio.demo.services.Cobranca;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Defini uma porta fixa somente pra facilitar os testes.
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
public class CobrancaController {

    @PostMapping("/cobrar-conta")

    public boolean enviarLinkPagamento(@RequestBody ResultadoCalculo resultadoCalculo) {
        return Cobranca.enviarLinkPagamento(resultadoCalculo);
    }
}
