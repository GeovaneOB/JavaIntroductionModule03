package org.example;

// Importando a biblioteca ArrayList:
import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        // Instanciando um ArrayList do tipo double:
        ArrayList<Double> notas = new ArrayList<>();

            // Adicionando em ordem como em um for normal:
            notas.add(10.0);
            notas.add(8.0);

            // Exibindo as notas adicionadas nos vetores de posição 0 e 1:
            for(double nota:notas){
                System.out.println("Nota: " + nota);
            }

    }
}