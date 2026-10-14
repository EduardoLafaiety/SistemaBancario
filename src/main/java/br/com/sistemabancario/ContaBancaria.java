package br.com.sistemabancario;

public class ContaBancaria {

    public ContaBancaria(int numeroDaConta, double saldo, String nomeDoTitular) {

        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;

    }

    private int numeroDaConta;
    private double saldo;
    private String nomeDoTitular;

    public double receber (double saldo){

        this.saldo += saldo;

        return saldo;

    }

    public double transferir (double saldo){

        this.saldo -= saldo;

        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }


}
