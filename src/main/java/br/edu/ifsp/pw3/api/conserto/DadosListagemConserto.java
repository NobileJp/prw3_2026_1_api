package br.edu.ifsp.pw3.api.conserto;

public record DadosListagemConserto(
        Long id,
        String dataEntrada,
        String dataSaida,
        String nomeMecanico,
        String marcaVeiculo,
        String modeloVeiculo
) {
    public DadosListagemConserto(Conserto conserto) {
        this(
                conserto.getId(),
                conserto.getDataEntrada(),
                conserto.getDataSaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo()
        );
    }
}