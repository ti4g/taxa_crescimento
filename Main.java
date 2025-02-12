// Classe principal para testar a Biblioteca
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("Buscar livro '1984': " + biblioteca.buscarLivroPorTitulo("1984").getAutor());
        System.out.println("Todos os livros em ordem de chegada:");
        biblioteca.exibirLivros();
    }
}
