package Set;
/*
Dadas as seguintes informações sobre minhas séries favoritas
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio
Serie 1 = nome: got, genero:fantasia, tempoEpisódio:60;
Serie 1 = nome: dark, genero:drama, tempoEpisódio:60;
Serie 1 = nome: that '70s show, genero:comédia, tempoEpisódio:25;

 */

import java.util.*;

public class Ordenando {
    public static void main(String[] args) {
        System.out.println("Forma Aleatória");
        Set<Serie> series = new HashSet<>(){{//HashSet insere em ordem aleatória
            add(new Serie( "got", "fantasia",60));
            add(new Serie( "dark", "drama",60));
            add(new Serie( "that '70s show", "comédia",25));
        }};
        System.out.println(series);

        System.out.println("ordem de inserção: ");
        Set<Serie>series2 = new LinkedHashSet<>(){{//LinkedSet por ordem de inserção
            add(new Serie( "got", "fantasia",60));
            add(new Serie( "dark", "drama",60));
            add(new Serie( "that '70s show", "comédia",25));
        }};
        System.out.println(series2);
        System.out.println("Ordem natural (tempoEpisodio)");
        Set<Serie>series3 = new TreeSet<>(){{
            add(new Serie( "got", "fantasia",60));
            add(new Serie( "dark", "drama",60));
            add(new Serie( "that '70s show", "comédia",25));
        }};
        System.out.println(series3);

    }
}

class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome)
                && Objects.equals(genero, serie.genero)
                && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareToIgnoreCase(serie.getGenero());
    }
}