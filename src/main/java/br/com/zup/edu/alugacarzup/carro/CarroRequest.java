package br.com.zup.edu.alugacarzup.carro;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CarroRequest {

    @NotBlank
    private String modelo;

    @NotNull
    private Integer ano;

    @NotBlank
    private String marca;

    @Deprecated
    CarroRequest(){}

    public CarroRequest(String modelo, Integer ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public Carro toModel() {
        return new Carro(modelo, ano, marca);
    }
}
