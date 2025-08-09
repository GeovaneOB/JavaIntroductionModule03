package org.example;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double[] notas = new double[2];
        double soma = 0;
        int nNotas = 2;

        for (int i = 0; i < nNotas; i++) {

            do {
                System.out.println("Qual é a " + (i + 1) + "° nota?");
                notas[i] = sc.nextDouble();
                soma += notas[i];
            } while (notas[i] < 0 || notas[i] > 10);
        }

        System.out.println();

        System.out.print("Exibindo notas registradas: ");

        System.out.println();

        for (int i = 0; i < nNotas; i++) {
            System.out.println("\nNota " + (i+1) + ": " + notas[i]);
        }

        System.out.println();

        double media = (soma) / nNotas;

        System.out.print("Média registrada: ");

        System.out.println();

        System.out.println("\nA média obtida é igual a: " + media);




    }

}
