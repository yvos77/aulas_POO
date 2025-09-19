package br.edu.iesb.app.br.edu.iesb.app.infra;

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.SQLExcepetion;
import java.sql.Statement;

public class Repository {
    private static final String JDBC_URL = "jdbc:h2:mem:userdb;DB_CLOSE_DELAY=-1"; // ~/tests
    private static final String USER = "sa";
    private static final String PASS = "";

    public Repository() {
        try (Connection conn = DriveManager.getConnection(JDBC_URL, USER, PASS)) {
            Statement st = conn.createStatement();
            st.executeUpdate("""
                CREATE TABLE IF NOT EXISTS users (
                    id IDENTITY PRIMARY KEY,
                    nome VARCHAR(255),
                    email VARCHAR(255) UNIQUE,
                    idade INT
                );
                """);

        } catch (SQLExcepetion e) {
            throw new RuntimeException("Erro ao inicializar o BANCO DE DADOS H2", e);
        }
    }

    public void save(User u) {
        try (Connection conn = DriveManager.getConnection(JDBC_URL, USER, PASS)) {
            PreparedStatement ps = conn.prepareStatement (
                "INSERT INTO users (nome, email, idade) VALUES (?, ?, ?);"

                );
            ps.setString(1, u.nome());
            ps.setString(2, u.email());
            ps.setInt(3, u.idade());
            ps.executeUpdate();
        } catch (SQLExcepetion e) {
            if (e.getMessage() != null && e.getMessage().contains("Unique index or primary key violation")) // throw new DuplicateUserException("Email já cadastrado: " + u.nome)
            e.printStackTrace();
        }
        throw new RuntimeException("Erro ao salvar usuario" + e);
    }
}
