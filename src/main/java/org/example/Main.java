package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente contaCorrente = new ContaCorrente(12345, "João");
        ContaPoupanca contaPoupanca = new ContaPoupanca(54321, "Maria");
        ContaInvestimento contaInvestimento = new ContaInvestimento(98765, "Pedro");

        // Testando o método depositar
        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);
        contaInvestimento.depositar(2000);

        // Exibindo informações
        contaCorrente.exibirInformacoes();
        contaPoupanca.exibirInformacoes();
        contaInvestimento.exibirInformacoes();

        // Testando saques
        System.out.println("\nTentando sacar da conta corrente:");
        contaCorrente.sacar(1200); // Deveria usar cheque especial
        contaCorrente.exibirInformacoes();

        System.out.println("\nTentando sacar da conta poupança:");
        contaPoupanca.sacar(600); // Não deve permitir o saque
        contaPoupanca.exibirInformacoes();

        System.out.println("\nTentando sacar da conta investimento:");
        contaInvestimento.sacar(500); // Deve aplicar 2% de taxa
        contaInvestimento.exibirInformacoes();

        // Testando a conta salário
        ContaSalario contaSalario = new ContaSalario(11111, "Ana");
        contaSalario.depositar(3000);
        contaSalario.exibirInformacoes();

        System.out.println("\nTentando sacar da conta salário:");
        contaSalario.sacar(1000); // Saque gratuito
        contaSalario.exibirInformacoes();

        // Tentando sacar mais um saque na conta salário
        contaSalario.sacar(500); // Deve ter taxa de R$5,00
        contaSalario.exibirInformacoes();

        // Testando a conta investimento alto risco
        ContaInvestimentoAltoRisco contaInvestimentoAltoRisco = new ContaInvestimentoAltoRisco(22222, "Lucas");
        contaInvestimentoAltoRisco.depositar(15000);
        contaInvestimentoAltoRisco.exibirInformacoes();

        System.out.println("\nTentando sacar da conta investimento alto risco:");
        contaInvestimentoAltoRisco.sacar(5000); // Deve aplicar 5% de taxa
        contaInvestimentoAltoRisco.exibirInformacoes();
    }
}