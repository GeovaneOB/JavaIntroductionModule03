package org.example;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorMediaEscolar = 7.0;

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite a 1° nota: ");
        double primeiraNota = sc.nextDouble();

        System.out.println("Digite a 2° nota: ");
        double segundaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if(media >= valorMediaEscolar) {
            System.out.println("Parabéns!!\nA sua média é: " + media + "\nVocê foi aprovado!!");
        }
        else {
            System.out.println("Ops!\nA sua média é: " + media + "\nVocê foi reprovado!");
        }

    }

}
