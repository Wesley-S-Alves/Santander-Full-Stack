import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    nomeIdade();
    nota();
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

    public static void nota(){
       Scanner sc = new Scanner(System.in);
       int nota = 15;
       while (nota > 10){
           System.out.print("insira a sua nota: ");
           nota = sc.nextInt();
           if (nota > 10) {
               System.out.println("Valor inserido é maior que 10");
           } else {
               System.out.println(" o valor inserido foi de " + nota);
               break;
           }
       }
        System.out.println("Muito Obrigado");
    }
}
