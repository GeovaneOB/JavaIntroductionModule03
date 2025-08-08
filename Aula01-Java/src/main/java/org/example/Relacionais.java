package org.example;

public class Relacionais {

    public static void main(String[] args) {
        int a = 24;
        int b = 55;
        int maior;

        System.out.println("\n====== OPERADORES RELACIONAIS ======\n");

        if (a > b) {
            maior = a;
            System.out.println(a + " é maior que " + b);
        } else {
            maior = b;
            System.out.println(b + " é maior que " + a);
        }

        System.out.println("O maior número é: " + maior);
    }
}
