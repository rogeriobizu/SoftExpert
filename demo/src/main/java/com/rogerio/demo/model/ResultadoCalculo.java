package com.rogerio.demo.model;

import java.util.List;

public class ResultadoCalculo {
    private List<AmigoResultado> amigosResultados;

    public ResultadoCalculo() {}
    public ResultadoCalculo(List<AmigoResultado> amigosResultados) {
        this.amigosResultados = amigosResultados;
    }

    public List<AmigoResultado> getAmigosResultados() {
        return amigosResultados;
    }

    public void setAmigosResultados(List<AmigoResultado> amigosResultados) {
        this.amigosResultados = amigosResultados;
    }
}