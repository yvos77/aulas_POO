package aula5.excecoes;
// import java.util.Scanner;
import java.io.IOException;

public class Zero_excecao {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Digite um número: ");
        // int x = sc.nextInt();
        // sc.close();

        int x = 0;

        try {

            int y = 100 / x;
            System.out.println("Resultado: " + y);

        } catch (ArithmeticException e) {

            System.out.println("Operação inválida");
            System.out.println("Detalhes do erro: " + e);
            System.out.println("Mensagem: " + e.getLocalizedMessage());
            e.printStackTrace();

        } finally {

            System.out.println("Finalizado!");

        }
    }
}
