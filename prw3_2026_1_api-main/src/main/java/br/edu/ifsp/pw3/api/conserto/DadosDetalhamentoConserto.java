package br.edu.ifsp.pw3.api.conserto;

public record DadosDetalhamentoConserto(
        Long id,
        String dataEntrada,
        String dataSaida,
        String nomeMecanico,
        String anosExperiencia,
        String marcaVeiculo,
        String modeloVeiculo,
        String anoVeiculo,
        String corVeiculo
) {
    public DadosDetalhamentoConserto(Conserto conserto) {
        this(
                conserto.getId(),
                conserto.getDataEntrada(),
                conserto.getDataSaida(),
                conserto.getMecanico().getNome(),
                conserto.getMecanico().getAnosExperiencia(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo(),
                conserto.getVeiculo().getAno(),
                conserto.getVeiculo().getCor()
        );
    }
}