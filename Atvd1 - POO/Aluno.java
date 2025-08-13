public class Aluno {
    String nome;
    int idade;
    String curso;

    void apresentar() {
        System.out.printf("Informações do aluno:\nNome: %s\nIdade: %d\nCurso: %s\n", nome, idade, curso);
    }

    public static void main(String args[]) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Yuri";
        aluno1.idade = 19;
        aluno1.curso = "Ciência da computação";

        aluno1.apresentar();
    }
}
