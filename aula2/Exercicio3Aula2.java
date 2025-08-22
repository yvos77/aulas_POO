import java.util.Scanner;

public class Exercicio3Aula2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.printf("Digite 5 números inteiros: \n");

        for (int i=0; i<numeros.length; i++) {
            System.out.printf("Número %d: ", i+1);
            numeros[i] = sc.nextInt();
        }

        sc.close();

        System.out.print("\nNúmeros digitados: ");
        for (int i=0; i<numeros.length; i++) {
            if (i<=3) {
                System.out.printf("%d, ", numeros[i]);
            } else {
                System.out.printf("%d", numeros[i]);
            }
        }
    }
}

