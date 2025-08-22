import java.util.Scanner;

public class Desafio3Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String str = sc.nextLine();
        sc.close();
        char[] charArray = str.toCharArray();
        int tamanho = str.length();
        for (int i = 0, j = tamanho-1; i < j; i++, j--) {
            char temp;
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        String convertida = String.valueOf(charArray);
        System.out.println("String invertida: " + convertida);
    }
}
