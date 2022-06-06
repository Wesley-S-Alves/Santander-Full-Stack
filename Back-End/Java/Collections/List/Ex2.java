package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:
    1. Telefonou para a vítima?
    2. Esteve no local do crime?
    3. Mora perto da vítima?
    4. Devia para a vítima?
    5. Já trabalhou com a vítima?
Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como Suspeita, entre 3 e 4 como Cúmplice e caso 5
deve ser considerada assassina. Caso contrário, será classificada
como Inocente;
 */
public class Ex2 {
    public static void main(String[] args) {
       //Suspeito s1 = pergunta();

       List<Suspeito> suspeitos = new ArrayList<>(){{
          add(pergunta());
       }};
        System.out.println(" O Interrogado foi declarado: " + suspeitos.get(0).getAssassino());

    }

    public static Suspeito pergunta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Interrogatório Policial ---");
        System.out.print("Insira o nome do Interrogado: ");
        Suspeito s1 = new Suspeito(sc.next());
        System.out.println("Telefonou para a vítima?");
        s1.setTelefenou(converte());
        System.out.println("Esteve no local do crime?");
        s1.setEsteveLocal(converte());
        System.out.println("Mora Perto da vítima?");
        s1.setMoraPerto(converte());
        System.out.println("Devia para a vítima?");
        s1.setDevia(converte());
        System.out.println("Já trabalhou para a vítima?");
        s1.setTrabalhou(converte());
        s1.isAssassino();

        return s1;
    }

    public static boolean converte( ){
        Scanner sc = new Scanner(System.in);
        int i =999;
        while (i!= 1 || i!=0){
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("0- Não     1- Sim");
            i = sc.nextInt();
            if(i == 1 || i==0) break;
        }
        if(i == 1) return true;
        return false;
    }
}



class Suspeito{

    private String nome;
    private boolean telefenou;
    private boolean esteveLocal;
    private boolean moraPerto;
    private boolean devia;
    private boolean trabalhou ;

    private String assassino;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTelefenou() {
        return telefenou;
    }

    public void setTelefenou(boolean telefenou) {
        this.telefenou = telefenou;
    }

    public boolean isEsteveLocal() {
        return esteveLocal;
    }

    public void setEsteveLocal(boolean esteveLocal) {
        this.esteveLocal = esteveLocal;
    }

    public boolean isMoraPerto() {
        return moraPerto;
    }

    public void setMoraPerto(boolean moraPerto) {
        this.moraPerto = moraPerto;
    }

    public boolean isDevia() {
        return devia;
    }

    public void setDevia(boolean devia) {
        this.devia = devia;
    }

    public boolean isTrabalhou() {
        return trabalhou;
    }

    public void setTrabalhou(boolean trabalhou) {
        this.trabalhou = trabalhou;
    }

    public String getAssassino() {
        return assassino;
    }

    public Suspeito(String nome, boolean telefenou, boolean esteveLocal,
                    boolean moraPerto, boolean devia,
                    boolean trabalhou) {
        this.nome = nome;
        this.telefenou = telefenou;
        this.esteveLocal = esteveLocal;
        this.moraPerto = moraPerto;
        this.devia = devia;
        this.trabalhou = trabalhou;
        this.assassino = isAssassino();
    }

    public Suspeito(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Suspeito{" +
                "nome='" + nome + '\'' +
                ", telefenou=" + telefenou +
                ", esteveLocal=" + esteveLocal +
                ", moraPerto=" + moraPerto +
                ", devia=" + devia +
                ", trabalhou=" + trabalhou +
                ", assassino='" + assassino + '\'' +
                '}';
    }

    public String isAssassino(){
        int count = 0;
        if (this.telefenou == true) {
            count+=1;
        }
        if (this.esteveLocal == true) {
            count+=1;
        }
        if (this.moraPerto == true) {
            count+=1;
        }
        if (this.devia == true) {
            count+=1;
        }
        if (this.trabalhou == true) {
            count+=1;
        }

       if (count < 2){
           this.assassino ="Inocente";
            return "Inocente";
        }else if(count == 2){
           this.assassino = "Suspeito";
            return "Suspeito";
        }else if (count > 2 && count < 5){
           this.assassino = "Cumplice";
           return "Cumplice";
        }
       this.assassino ="Assassino";
        return "Assassino";
    }
}