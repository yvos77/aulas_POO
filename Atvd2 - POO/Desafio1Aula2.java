import java.util.Scanner;

public class Desafio1Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        int numeroInteiro;
        float numeroFlutuante;
        String nomeComposto;
        System.out.printf("Digite um int, um float e um nome composto separados por TAB: ");
        String[] tudo = sc.nextLine().split("\t");
        sc.close();

        if (tudo.length != 3) {
            System.out.println("\nEntrada Inválida! Digite 3 valores separados por [TAB]\n");
            return;
        }

        numeroInteiro = Integer.parseInt(tudo[0]);
        numeroFlutuante = Float.parseFloat(tudo[1]);
        nomeComposto = tudo[2];

        System.out.printf("Você digitou o número inteiro: %d\n", numeroInteiro);
        System.out.printf("Você digitou o número flutuante: %.2f\n", numeroFlutuante);
        System.out.printf("Você digitou o nome composto: %s\n", nomeComposto);
    }
}
