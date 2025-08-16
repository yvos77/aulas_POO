import java.util.Scanner;

public class Exercicio4Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de provas realizadas: ");
        int qtdProvas = sc.nextInt();

        int contador = 0;
        float total = 0;

        while (contador < qtdProvas) {
            System.out.printf("Digite a nota da prova %d: ", contador+1);
            float prova = sc.nextFloat();
            total += prova;
            contador++;
        }

        sc.close();

        float media = total / qtdProvas;

        System.out.printf("Você fez %d provas e a média entre elas é: %.2f", qtdProvas, media);
    }
}
