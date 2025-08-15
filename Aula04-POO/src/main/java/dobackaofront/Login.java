package dobackaofront;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String userName = "Moiço";
        String password = "123";

        Scanner sc = new Scanner(System.in);

        System.out.println("====== TELA DE LOGIN ======");
        System.out.println("INFORME O SEU USUÁRIO: ");
        String nomeInformado = sc.next();
        System.out.println("INFORME A SUA SENHA: ");
        String senhaInformada = sc.next();

        if (nomeInformado.equals(userName) && senhaInformada.equals(password)) {
            System.out.println("Seja bem-vindo " + userName);
        } else {
            System.out.println("Não foi possível efetuar o login! O usuário " + nomeInformado + " ou a senha informada não está cadastrado em nosso sistema!");
        }

        sc.close();
    }
}
