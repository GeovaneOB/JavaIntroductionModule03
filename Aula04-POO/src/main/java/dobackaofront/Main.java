package dobackaofront;

public class Main {

    public static void main(String[] args) {

        //INSTANCIANDO OS OBJETOS:
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        //ATRIBUINDO VALORES AO ATRIBUTOS DA CLASSE PESSOAS
        //p1.nome = "Geovane";
        p1.setNome("Geovane");
        p1.setCpf("090.197.293-76");

        //p2.nome = "Samambaia";
        p2.setNome("Samambaia");
        p2.setCpf("000.111.222-33");

        //EXIBINDO OS DADOS:
        System.out.println("EXIBINDO DADOS: \n");

        System.out.println("NOME: " + p1.getNome());
        System.out.println("CPF: " + p1.getCpf());

        System.out.println();

        System.out.println("NOME: " + p2.getNome());
        System.out.println("CPF: " + p2.getCpf());

    }

}
