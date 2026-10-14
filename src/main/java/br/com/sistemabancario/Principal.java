package br.com.sistemabancario;

public class Principal {

    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria(141, 3500, "Eduardo Lopes");
        ContaCorrente contaCorrente = new ContaCorrente(444, 2500, "Agatha Lafaiety", 250);

        System.out.println(contaBancaria);
        System.out.println(contaCorrente);

        System.out.println(contaBancaria.getSaldo());
        System.out.println(contaCorrente.getSaldo());

        System.out.println(contaBancaria.transferir(300));
        System.out.println(contaBancaria.receber(300));

    }

}
