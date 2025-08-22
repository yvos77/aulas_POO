package app;
import java.util.Scanner;

public class Elevador {
    private int andarAtual;
    private int quantidadedePessoas;
    private int capacidadeMaxima;
    private int totalAndares;

    public int entrar() {
        quantidadedePessoas += 1;
        if (quantidadedePessoas > capacidadeMaxima) {
            quantidadedePessoas -= 1;
            System.out.print("\nO elevador está cheio, espere o próximo!\n");
        } else {
            System.out.print("\nEntrou 1 pessoa\n");
        }
        return quantidadedePessoas;
    }

    public int sair() {
        quantidadedePessoas -= 1;
        if (quantidadedePessoas >= 0) {
            System.out.print("\nSaiu 1 pessoa\n");
        } else {
            quantidadedePessoas += 1;
            System.out.print("\nNão tem ninguém no elevador para sair!\n");
        }
        return quantidadedePessoas;
    }

    public int subir() {
        andarAtual += 1;
        if (andarAtual > totalAndares) {
            andarAtual -= 1;
            System.out.print("\nVocê chegou no último andar!\n");
        } else {
            System.out.print("\nSubiu 1 andar\n");
        }
        return andarAtual;
    }

    public int descer() {
        andarAtual -= 1;
        if (andarAtual >= 0) {
            System.out.print("\nDesceu 1 andar\n");
        } else {
            andarAtual += 1;
            System.out.print("\nVocê chegou no térreo!\n");
        }
        return andarAtual;
    }

    public void exibir() {
        System.out.printf("O andar atual é: %d\n", andarAtual);
        System.out.printf("A quantidade de pessoas é: %d\n", quantidadedePessoas);
    }

    public static void main(String[] args) {

        Elevador nElevador = new Elevador();
        nElevador.capacidadeMaxima = 10;
        nElevador.totalAndares = 18;
        
        Scanner sc = new Scanner(System.in);
        String acao;

        do {
            System.out.print("\nO que deseja fazer?: ");
            acao = sc.nextLine().toLowerCase();

            switch (acao) {
                case "entrar":
                    nElevador.entrar();
                    break;
                case "sair":
                    nElevador.sair();
                    break;
                case "subir":
                    nElevador.subir();
                    break;
                case "descer":
                    nElevador.descer();
                    break;
                case "parar":
                    System.out.print("\nFinalizando programa...\n");
                    break;
                default:
                    System.out.print("\nEscreva o que deseja fazer!\n");
                    break;
        }
        
        nElevador.exibir();

        }   while (!acao.equals("parar"));

        sc.close();

    }
}