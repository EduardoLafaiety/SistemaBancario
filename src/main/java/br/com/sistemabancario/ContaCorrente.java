package br.com.sistemabancario;

public class ContaCorrente extends ContaBancaria {


    public ContaCorrente(int numeroDaConta, double saldo, String nomeDoTitular, double taxaManutencao) {

        super(numeroDaConta, saldo, nomeDoTitular);
        this.taxaManutencao = taxaManutencao;

    }

    private double taxaManutencao;

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

}
