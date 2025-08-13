public class Livro {
    String titulo;
    String autor;
    int ano;

    void exibir() {
        System.out.printf("Informações sobre o livro:\nO nome do livro é '%s' e foi escrito por '%s' no ano de %d", titulo, autor, ano);
    }
    public static void main(String args[]) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.ano = 1899;

        livro1.exibir();
    }
}
