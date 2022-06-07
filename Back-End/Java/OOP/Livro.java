class Livro {
    private String nome;
    private String subTitulo;
    private String autor;
    private String editora;
    private String quantPaginas;
    private String isbn;
    private String anoPublicacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getQuantPaginas() {
        return quantPaginas;
    }

    public void setQuantPaginas(String quantPaginas) {
        this.quantPaginas = quantPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", subTitulo='" + subTitulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", quantPaginas='" + quantPaginas + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoPublicacao='" + anoPublicacao + '\'' +
                '}';
    }

    public Livro(String nome, String subTitulo,
                 String autor, String editora,
                 String quantPaginas, String isbn,
                 String anoPublicacao) {
        this.nome = nome;
        this.subTitulo = subTitulo;
        this.autor = autor;
        this.editora = editora;
        this.quantPaginas = quantPaginas;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
    }
}
