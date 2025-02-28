package org.example;

public abstract class ContaBancaria {
    private int  numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
    public abstract void sacar(double valor);

    public void exibirInformacoes(){
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("\n\n");
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
