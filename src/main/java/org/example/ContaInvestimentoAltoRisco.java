package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    private static final double SALDO_MINIMO = 10000.00;
    private static final double TAXA = 0.05;
    public ContaInvestimentoAltoRisco(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void sacar(double valor) {
        double valorTaxado = valor * TAXA;
        if (getSaldo()>=SALDO_MINIMO+valorTaxado) {
            setSaldo(getSaldo()-(valorTaxado + valor));
            System.out.println("Saque realizado com sucesso! - SALDO: "+getSaldo());
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
