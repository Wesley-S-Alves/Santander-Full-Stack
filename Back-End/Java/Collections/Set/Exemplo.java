package Set;
//não permite itens repetidos e não mantém index ou ordem
import java.util.*;

public class Exemplo {
    public static void main(String[] args) {
//      Set notas = new HashSet(); antes do java
//      HashSet<Double> notas = new HashSet<>()
//      Set<Double> notas = new HashSet<>(); diamond Operator
//      Set<Double> notas =Set.of(7d, 8.5,9.3,5.0,7.0,0.0,3.6);
//      notas.add(1d);
//      notas.remove(5d);
//      System.out.println(notas);


        System.out.println(("Crie um conjunto e adicione as notas: "));
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5,9.3,5.0,7.0,0.0,3.6));
        System.out.println(notas);
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("Exiba a soma dos valores: ");
        Double soma = 0d;
        Iterator<Double> iter = notas.iterator();
        while(iter.hasNext()){
            soma+= iter.next();
        }
        System.out.println(soma);

        System.out.println("Média das notas: " + (soma/ notas.size()));
        System.out.println("Remova a nota zero: " + notas.remove(0d) + notas);
        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7) iterator.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba as notas em ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todos o conjuntos: ");
        notas.clear();
        notas2.clear();
        notas3.clear();
        System.out.println(notas.isEmpty());
    }
}
