package br.edu.ifsp.pw3.api.mecanico;

import br.edu.ifsp.pw3.api.conserto.DadosAtualizacaoConserto;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {
    private String nome;
    private String anosExperiencia;

    public Mecanico(DadosMecanico dados) {
        this.nome = dados.nome();
        this.anosExperiencia = dados.anosExperiencia();
    }

    public void atualizarInformacoes(DadosAtualizacaoConserto dados) {
        if (dados.nomeMecanico() != null) {
            this.nome = dados.nomeMecanico();
        }
        if (dados.anosExperiencia() != null) {
            this.anosExperiencia = dados.anosExperiencia();
        }
    }
}