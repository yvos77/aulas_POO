package exercicios_aula2;

import java.util.Scanner;

public class Exercicio3Aula2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite 5 numeros separados: ");
        String num = sc.nextLine();
        sc.close();
        String[] numeros = num.split(" ");

        System.out.print("Numeros:\n");
        for (int i=0; i < numeros.length; i++) {
            System.out.printf("%s\n", numeros[i]);
        }
    }
}
