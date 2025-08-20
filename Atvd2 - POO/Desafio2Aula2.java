import java.util.Scanner;

public class Desafio2Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.print("Digite uma vogal: ");
        char vogal = sc.next().charAt(0);
        sc.close();

        System.out.printf("Você digitou a palavra %s\n", palavra);
        int ultimaPosicao = -1;
        for (int i=0;i<palavra.length();i++) {
            if (vogal == palavra.charAt(i)) {
                ultimaPosicao = i;
            }
        }
        if (ultimaPosicao != -1) {
            System.out.printf("A última ocorrência da vogal '%c' é no índice: %d", vogal, ultimaPosicao);
        } else {
            System.out.printf("Vogal não encontrada!");
        }
    }
}