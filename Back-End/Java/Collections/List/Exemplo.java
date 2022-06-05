package List;

import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
//      List notas = new ArrayList();//  antes do java 5
//      List<Double> notas = new ArrayList<Double>(); Diamond operator
//      List<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList( 7d, 8.3, 9.3, 5d, 7d, 0d, 3.6));
//      List<Double> notas = Arrays.asList(7d, 8.3, 9.3, 5d, 7d, 0d, 3.6);não pode adicionar ou remover novos itens na List
//      List<Double> notas = List.of(7d, 8.3, 9.3, 5d, 7d, 0d, 3.6);Lista imutável
        /* Crie uma lista e adicione 7 notas */
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.3);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5d));

        System.out.println("Adcionar uma nota 8 na posiçã0 4:");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 6:");
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas);

        System.out.print("Conferir se a nota 5.0 esta na lista: ");
        System.out.println(notas.contains(5d));

        for (Double nota : notas) System.out.print(nota + " ");
        System.out.println("");

        System.out.println("Exibir a terceira nova adicionada:");
        System.out.println(notas.get(2).toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        Collections.min(notas);

        System.out.println("Exibir a maior nota: " + Collections.max(notas));


        System.out.println("Exiba a soma dos valores: ");
        double soma =0;
        Iterator<Double> iter = notas.iterator();
        while(iter.hasNext()){
           soma += iter.next();
        }
        System.out.println(soma);

        System.out.println("Média dos valores: "+ soma/notas.size());

        System.out.println("Remover a nota zero:");
        System.out.println(notas.remove(notas.indexOf(0d)));
        System.out.println(notas);

        System.out.println("Remover notas menores que 8: ");
        Iterator<Double> iter1 = notas.iterator();
        while(iter1.hasNext()){
            Double next =iter1.next();
            if (next<8) iter1.remove();
        }
        System.out.println(notas);

        System.out.println("Limpar lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("confirme se esta vazia:" + notas.isEmpty());
    }
}
