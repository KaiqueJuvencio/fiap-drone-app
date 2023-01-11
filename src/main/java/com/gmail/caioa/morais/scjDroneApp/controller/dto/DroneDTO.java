package com.gmail.caioa.morais.scjDroneApp.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class DroneDTO {

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("rastreamento_ativo")
    private boolean isRastreamentoAtivo;
}
