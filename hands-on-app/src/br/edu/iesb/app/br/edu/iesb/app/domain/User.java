package br.edu.iesb.app.domain;

public record User(String nome, String email, int idade) {
    public User {
        if (idade < 18) throw new IllegalArgumentException("Idade >=");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("Email inválido");
    }
}

