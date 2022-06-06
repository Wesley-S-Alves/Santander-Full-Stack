package List;
/*
1 - Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista

2 - Calcule a média semestral das temperaturas e mostre
todas as temperaturas acima desta média, e em que mês elas
ocorreram(mostrar o mes por extenso: 1- Janeiro, 2- Fevereiro etc
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex1 {
    static List<Meses> mediaTemperatura = new ArrayList<>(){{
    add(new Meses("Janeiro", 24.5));
    add(new Meses("Fevereiro", 24.4));
    add(new Meses("Março", 23.2));
    add(new Meses("Abril", 21.0));
    add(new Meses("Maio", 18.1));
    add(new Meses("Junho", 16.2));
    }};

    public static void main(String[] args) {
        Double totalSemestre = 0d;
        Double mediaSemestral=0d;
        for (int i = 0; i < mediaTemperatura.size(); i++) {
            totalSemestre += mediaTemperatura.get(i).getMedia();
            mediaSemestral = totalSemestre / mediaTemperatura.size();
        }
        System.out.println("A média do semestre foi de: "+ mediaSemestral);

        System.out.println("Meses que a Temperatura média foi maior que a média semestral:");
        for (int i = 0; i < mediaTemperatura.size(); i++) {
            if (mediaTemperatura.get(i).getMedia() > mediaSemestral) {
                System.out.println("Mês: " + mediaTemperatura.get(i).getNome()
                        + " Temperatura: " + mediaTemperatura.get(i).getMedia());


            }
        }
    }
}


class Meses{
    private String nome;
    private Double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Meses(String nome, Double media) {
        this.nome = nome;
        this.media = media;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }
}
