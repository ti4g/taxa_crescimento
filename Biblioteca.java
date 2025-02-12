import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    // Array para armazenar livros em ordem de chegada
    private Livro[] livros;
    private int count;

    // Tabela hash para busca rápida por título
    private Map<String, Livro> livroMap;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.count = 0;
        this.livroMap = new HashMap<>();
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        if (count < livros.length) {
            livros[count] = livro;
            livroMap.put(livro.getTitulo(), livro);
            count++;
        } else {
            System.out.println("Biblioteca cheia!");
        }
    }

    // Método para buscar um livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        return livroMap.get(titulo);
    }

    // Método para exibir todos os livros em ordem de chegada
    public void exibirLivros() {
        for (int i = 0; i < count; i++) {
            System.out.println(livros[i].getTitulo());
        }
    }
}
