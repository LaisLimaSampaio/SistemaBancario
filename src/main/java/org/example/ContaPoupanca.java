package org.example;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void sacar(double valor) {
        if(valor>getSaldo()){
            System.out.println("Saldo Insuficiente");
        }
        else{
            setSaldo(getSaldo()-valor);
            System.out.println("Saque realizado com sucesso - Saldo atual: "+getSaldo());
        }

    }
}
