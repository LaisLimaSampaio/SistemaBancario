package org.example;

import java.time.LocalDate;

public class ContaSalario extends ContaCorrente{
    private boolean liberadoSaqueGratis = true;
    private static final double VALOR_TAXADO = 5.00;
    private int ultimoMesSaqueGratis;



    public ContaSalario(int numeroConta, String titular) {
        super(numeroConta, titular);
        this.ultimoMesSaqueGratis = LocalDate.now().getMonthValue();
    }

    public void sacar(double valor) {
        LocalDate dataAtual = LocalDate.now();
        int mesAtual = dataAtual.getMonthValue();

        if (mesAtual != ultimoMesSaqueGratis) {
            liberadoSaqueGratis = true;
            ultimoMesSaqueGratis = mesAtual;
        }

        if(valor<=getSaldo()){
            if(liberadoSaqueGratis) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso - Saldo atual: " + getSaldo());
                liberadoSaqueGratis = false;
            }else if(valor +VALOR_TAXADO<=getSaldo()){

                setSaldo(getSaldo() - (valor + VALOR_TAXADO));
                System.out.println("Saque realizado com sucesso - Saldo atual: " + getSaldo());
                System.out.println("Valor taxado: " + VALOR_TAXADO);
            }
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
}
