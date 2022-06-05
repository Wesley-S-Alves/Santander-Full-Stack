package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenando {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
           add(new Gato("Jon", 18,"preto"));
           add(new Gato("Simba", 6,"tigrado"));
           add(new Gato("Jon", 12,"amarelo"));
        }};
        System.out.println("--   Ordem de Inserção    --");
        System.out.println(gatos);

        System.out.println("--    Ordem Aleatória    --");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("-- Ordem Natural  --");
        Collections.sort(gatos);
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
}


