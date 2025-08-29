package aula4;

public class Pessoa {
    protected String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void cumprimentar() {
        System.out.printf("\nOlá, tudo bem? Meu nome é %s e tenho %d anos\n", nome, idade);
    }

    public static void main (String[] args) {

    }




}