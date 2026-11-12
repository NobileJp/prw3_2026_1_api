package br.edu.ifsp.pw3.api.conserto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoConserto(
        @NotNull Long id,
        String dataSaida,
        String nomeMecanico,
        String anosExperiencia
) {
}