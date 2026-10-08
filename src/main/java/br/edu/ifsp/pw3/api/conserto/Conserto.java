package br.edu.ifsp.pw3.api.conserto;

import br.edu.ifsp.pw3.api.mecanico.Mecanico;
import br.edu.ifsp.pw3.api.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataEntrada;
    private String dataSaida;

    @Embedded
    private Mecanico mecanico;

    @Embedded
    private Veiculo veiculo;

    private Boolean ativo;

    public Conserto(DadosCadastroConserto dados) {
        this.ativo = true;
        this.dataEntrada = dados.dataEntrada();
        this.dataSaida = dados.dataSaida();
        this.mecanico = new Mecanico(dados.mecanico());
        this.veiculo = new Veiculo(dados.veiculo());
    }

    public void atualizarInformacoes(DadosAtualizacaoConserto dados) {
        if (dados.dataSaida() != null) {
            this.dataSaida = dados.dataSaida();
        }
        this.mecanico.atualizarInformacoes(dados);
    }

    public void excluir() {
        this.ativo = false;
    }
}