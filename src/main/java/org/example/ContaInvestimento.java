package org.example;

public class ContaInvestimento extends ContaBancaria {
    private static final double TAXA = 0.02;

    public ContaInvestimento(int numeroConta, String titular) {
        super(numeroConta, titular);
    }


    @Override
    public void sacar(double valor) {
        if (valor<=getSaldo()) {
            double valorTaxado = valor*TAXA;
            setSaldo(getSaldo()-(valor+valorTaxado));
            System.out.println("Saque realizado com sucesso! - Saldo: " + getSaldo());
            System.out.println("Valor taxado: " + valorTaxado);
        }else{
            System.out.println("Saldo insuficiente!");
        }

    }
}
