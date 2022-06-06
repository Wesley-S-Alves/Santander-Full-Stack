package Map;
/*
Crie um Dict e o ordene
conteúdo:
Autor: Hawking, Stephen - Livro = Nome: Uma breve História do Tempo, páginas: 256;
Autor: Duhigg, Charles - Livro = Nome: O Poder do Hábito, páginas: 408;
Autor: Harari, Yuval - Livro = Nome: Lições Para o Século XXI, páginas: 432;

 */

import java.util.*;

import static javax.swing.UIManager.put;

public class Ordenando {
    public static void main(String[] args) {
        System.out.println("ordem aleatória");// hashmap
        Map<String, Book> livros = new HashMap<>(){{
           put("Hawking, Stephen",new Book("Uma Breve História do Tempo", 256));
           put("Harari, Yuval",new Book("21 Lições para o Século XXI", 432));
           put("Duhigg, Charles",new Book("O Poder do Hábito", 408));
        }};

        System.out.println(livros);

        for(Map.Entry<String, Book> livro: livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem de Inserção");//LinkedHashMap
        Map<String, Book> livros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen",new Book("Uma Breve História do Tempo", 256));
            put("Harari, Yuval",new Book("21 Lições para o Século XXI", 432));
            put("Duhigg, Charles",new Book("O Poder do Hábito", 408));
        }};
        System.out.println(livros1);

        System.out.println("ordem alfabetica");//TreeMap
        Map<String, Book> livros2 = new TreeMap<>(){{
            put("Hawking, Stephen",new Book("Uma Breve História do Tempo", 256));
            put("Harari, Yuval",new Book("21 Lições para o Século XXI", 432));
            put("Duhigg, Charles",new Book("O Poder do Hábito", 408));
        }};

        System.out.println(livros2);

    }
}

class Book{
    private String nome;
    private int paginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Book(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return paginas == book.paginas && Objects.equals(nome, book.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

