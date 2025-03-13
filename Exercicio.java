class Livro {
    private String nome;
    private int numeroPaginas;

    public Livro(String nome, int numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}

class Pessoa {
    private String nome;
    private int qtdLivrosLidos;
    private Livro livro;

    public Pessoa(String nome, Livro livro) {
        this.nome = nome;
        this.livro = livro;
        this.qtdLivrosLidos = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdLivrosLidos() {
        return qtdLivrosLidos;
    }

    public Livro getLivro() {
        return livro;
    }

    public void lerOutroLivro(Livro novoLivro) {
        this.livro = novoLivro;
        this.qtdLivrosLidos++;
    }

    public void exibirInformacoes() {
        System.out.println(nome + " leu o livro: " + livro.getNome() + " com " + livro.getNumeroPaginas() + " páginas.");
        System.out.println("Quantidade total de livros lidos: " + qtdLivrosLidos);
    }
}

public class Exercicio {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", 1000);
        Pessoa pessoa1 = new Pessoa("Izabel", livro1);

        pessoa1.exibirInformacoes();

        Livro livro2 = new Livro("Harry Potter", 500);
        pessoa1.lerOutroLivro(livro2);

        pessoa1.exibirInformacoes();
    }
}
