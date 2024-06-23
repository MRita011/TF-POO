package dados;

import java.util.Date;
import java.util.List;

public class Locacao {
    private int numero;
    private Status situacao;
    private Date dataInicio;
    private Date dataFim;
    private Cliente cliente;
    private List<Robo> robos;

    public Locacao(int numero, Status situacao, Date dataInicio, Date dataFim, Cliente cliente, List<Robo> robos) {
        this.numero = numero;
        this.situacao = situacao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.robos = robos;
    }

    public int getNumero() {
        return numero;
    }

    public double calculaValorFinal() {
        double valorTotal = 0;

        for (Robo robo : robos)
            valorTotal += robo.calculaLocacao(calculaDiasLocacao());

        valorTotal -= valorTotal * cliente.calculaDesconto(robos.size());
        return valorTotal;
    }

    private int calculaDiasLocacao() {
        return (int) ((dataFim.getTime() - dataInicio.getTime()) / (1000 * 60 * 60 * 24));
    }
}
