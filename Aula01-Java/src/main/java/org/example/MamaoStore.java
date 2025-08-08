package org.example;

public class MamaoStore {

    public static void main(String[] args) {

        // Declarando var´s:
        double valorTotal = 500.00;
        int numeroDePrestacoes = 5;

        // Mensagem Welcome:
        System.out.println("\nBem-vindo a MamãoStore!\n");

        // Propósito:
        System.out.println("O cliente Joãozinho fez uma compra de " + valorTotal + " e deseja dividir em 5x sem juros!");

        // Exibindo informações:
        System.out.println("\n====== INFORMAÇÕES DA TRANSAÇÃO ======");

        System.out.println("\nPAGAMENTO EFETUADO COM SUCESSO!!\n\nLOJA: MamãoStore\nCLIENTE: Joãozinho Carambola\n" +
                "VALOR TOTAL: R$ " + valorTotal + "\nTOTAL DIVIDIDO EM 5X S/ JUROS: R$ " + valorTotal/numeroDePrestacoes);

    }

}
