package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenando {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
           add(new Gato("Jon", 12,"amarelo"));
           add(new Gato("Simba", 6,"tigrado"));
           add(new Gato("Jon", 18,"preto"));
        }};
        System.out.println("--   Ordem de Inserção    --");
        System.out.println(gatos);

        System.out.println("--    Ordem Aleatória    --");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("-- Ordem Natural  --");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("-- Ordem de idade  --");
        //Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("-- ordem por cor  --");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("-- ordem Nome/Cor/Idade  --");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }


    static class Gato implements Comparable<Gato>{
        private String nome;
        private int idade;
        private String cor;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public Gato(String nome, int idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }

    static class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato gato, Gato t1) {
            return Integer.compare(gato.getIdade(), t1.getIdade());
        }
    }
    static class ComparatorCor implements Comparator<Gato>{

        @Override
        public int compare(Gato t1, Gato t2) {
            return t1.getCor().compareToIgnoreCase(t2.getCor());
        }
    }
    static class ComparatorNomeCorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if (nome != 0) return nome;

            int cor= g1.getCor().compareToIgnoreCase(g2.cor);
            if (cor!=0) return cor;

            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}



