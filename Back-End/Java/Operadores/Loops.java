import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    nomeIdade();
    }

    /* Exercicio 1  - Nome e idade */

    public static void nomeIdade(){
        Scanner sc = new Scanner(System.in);
        String nome = "";
        int idade;
        while (true) {
            System.out.println("insira um Nome");
            nome = sc.next();
            System.out.println("Insira a idade");
            if (nome.equals("0")) break;
            idade = sc.nextInt();
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        }
        System.out.println("Fechando App");
    }

}
