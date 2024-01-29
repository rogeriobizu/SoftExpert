package com.rogerio.demo.services;

import com.rogerio.demo.model.ResultadoCalculo;

public class Cobranca {

    public static boolean enviarLinkPagamento(ResultadoCalculo resultadoCalculo) {
       /**
        * Aqui teria codigos e validações de acordo com a API
        **/
       String linkPagamento = picPayAPI(resultadoCalculo,"dados do usuario");
        try {
            //Aqui seria a tentativa de envio
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static String picPayAPI(ResultadoCalculo resultadoCalculo, String dadosDoUsuario){
        //Tratamento API do PicPay

        return "link da pagamento";
    }

}
