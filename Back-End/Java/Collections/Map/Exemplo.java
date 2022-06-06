package Map;
/*
elementos unicos definidos por pares chave:valor
 */

import java.util.*;

public class Exemplo {

    /*
    Map carros2020 = new HashMap(); < Java 5
    Map<String, Double>carros2020 = new HashMap<>(); Diamond
    HashMap<String, Double> carros2020 = new HashMap<>();
    Map<String, Double> carros2020 = Map.of("gol", 14.4, "uno", 16.6);
     */
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos" +
                "e seus repectivos consumos: ");
        Map<String, Double> carros2020 = new HashMap<>(){{
           put("Gol", 14.4);
           put("Uno", 15.6);
           put("Mobi", 16.1);
           put("Hb20", 14.5);
           put("Kwid", 15.6);
        }};
        System.out.println(carros2020);

        System.out.println("Substituir o consumo do gol por 15,2");
        carros2020.put("Gol", 15.2);
        System.out.println(carros2020);

        System.out.println("Confira se o modelo Kwid está no dicionário: " +
                carros2020.containsKey("Kwid"));

        System.out.println("Exiba o consumo do Uno: " + carros2020.get("Uno"));

        System.out.println("Exiba os somente os modelos: ");
        Set<String> modelos = carros2020.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumo = carros2020.values();
        System.out.println(consumo);

        System.out.println("Exiba o carro mais economico e seu consumo: ");
        Double melhorConsumo = Collections.max(carros2020.values());
        Set<Map.Entry<String, Double>> entries = carros2020.entrySet();
        String modeloEficiente = "";
        for(Map.Entry<String, Double> entry:entries){
            if(entry.getValue().equals(melhorConsumo)){
                modeloEficiente = entry.getKey();
            }
        }
        System.out.println(modeloEficiente);

        System.out.println("Exiba o carro menos economico: ");
        Double piorConsumo = Collections.min(carros2020.values());
        String modeloMenosEficiente="";
        for(Map.Entry<String,Double> entry:entries){
            if (entry.getValue().equals(piorConsumo)){
                modeloMenosEficiente = entry.getKey();
            }
        }
        System.out.println(modeloMenosEficiente);

        System.out.println("Exiba a soma dos consumos: ");
        Double soma=0d;
        for(Double value:carros2020.values()){
            soma+= value;
        }

        System.out.println(soma);

        System.out.println("Exiba a méda dos consumos: ");
        Double media = soma / carros2020.size();
        System.out.println(media);

        System.out.println("remova os modelos com o sonsumo igual a 15.6");
        Iterator<Double> iter = carros2020.values().iterator();
        while(iter.hasNext()){
            if(iter.next().equals(15.6))iter.remove();
        }
        System.out.println(carros2020);
        System.out.println("Exiba os carros por ordem de adição");
        Map<String, Double> carros2020b = new LinkedHashMap<>(){{//<- LinkedHashMap
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carros2020b);

        System.out.println("Por modelo (ordem natural)");
        Map<String, Double> carros2020c = new TreeMap<>(){{//<-Treemap
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carros2020c);

        System.out.println("Apagar os conjuntos");
        carros2020.clear();
        carros2020b.clear();
        carros2020c.clear();
        System.out.println(carros2020.isEmpty());

    }
}
