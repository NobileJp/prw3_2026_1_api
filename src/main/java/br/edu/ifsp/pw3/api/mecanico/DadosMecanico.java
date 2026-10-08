package br.edu.ifsp.pw3.api.mecanico;

import jakarta.validation.constraints.NotBlank;

public record DadosMecanico(
        @NotBlank String nome,
        String anosExperiencia
) {
}