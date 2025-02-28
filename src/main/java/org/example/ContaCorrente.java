package org.example;


public class ContaCorrente extends ContaBancaria {
    private static final double LIMITE_CHEQUE_ESPECIAL = 1000;
    private double limiteAtualCheque = LIMITE_CHEQUE_ESPECIAL;

    public ContaCorrente(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limiteAtualCheque;

        if (valor > saldoDisponivel) {
            System.out.println("Não é possível sacar este valor nem mesmo com cheque especial.");
        } else if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente\nUsando cheque especial...");
            double valorUsadoCheque = valor - getSaldo();
            setSaldo(-valorUsadoCheque);
            limiteAtualCheque -= valorUsadoCheque;
        }

    }
}
