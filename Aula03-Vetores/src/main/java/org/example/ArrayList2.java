package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            System.out.println("Informe a " + (notas.size() + 1) + "° nota: ");
            notas.add(sc.nextDouble());

            System.out.println("Deseja inserir mais uma nota?\n");
            System.out.println("(Y) CONTINUAR\n(N) SAIR");
            resposta = sc.next();
        }while(!resposta.equalsIgnoreCase("N"));

        System.out.println("Exibindo notas: ");
        for(double nota:notas) {
            System.out.println("Nota: " + nota);
        }

    }

}
