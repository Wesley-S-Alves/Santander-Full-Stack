import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        nomeIdade();
        nota();
        media();
        parOuImpar();
        tabuada();
        fatorial();
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

    public static void media (){
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int media = 0;
        int num;
        int cont = 0;
        while(cont < 5){
            System.out.print("insira o " + (cont+1) + "º número: ");
            num = sc.nextInt();
            if(num > maior) maior = num;
            media+=num;
            cont++;
        }
        System.out.println("a média total dos numéro foi de " +
                + (media/5) +" e o maior número inserido foi: "+maior);
    }

    public static void parOuImpar(){
        Scanner sc =new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int num;
        int cont = 0;
        System.out.print("Insira a quantidade de numeros que serão inseridos: ");
        cont = sc.nextInt();
        while(cont > 0){
            System.out.print("Insira um número: ");
            num = sc.nextInt();
            if (num%2 == 0){
                par +=1;
            }else{
                impar +=1;
            }
            cont--;
        }
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);


    }

    public static void tabuada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Tabuada------");
        System.out.print("Insira um número para continuar: ");
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println(num + " X " + (i+1) + " = " + num*(i+1));
        }
    }

    public static void fatorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("------Fatorial------");
        System.out.print("Insira um número para fatoração:");
        int num = sc.nextInt();
        int total = 1;
        for (int i = 0; i < num ; i++) {
            total *= (num-i);
        }
        System.out.println(total);
    }


}
