import java.text.Normalizer;
import java.util.Scanner;

public class Desafio4Aula2 {

    // Método para remover acentos
    public static String removerAcentos(String input) {
        if (input == null) return null;
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                         .replaceAll("\\p{M}", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String str = sc.nextLine();
        sc.close();

        // 1ª etapa: transformar em minúsculo
        str = str.toLowerCase();

        // 2ª etapa: remover caracteres especiais e espaços
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        // 3ª etapa: remover acentos
        str = removerAcentos(str);

        // 4ª etapa: verificar se é palíndromo
        boolean ehPalindromo = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                ehPalindromo = false;
                break;
            }
        }

        // Resultado
        if (ehPalindromo) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo!");
        }
    }
}
