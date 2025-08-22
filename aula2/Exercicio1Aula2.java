import java.util.Scanner;

public class Exercicio1Aula2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.printf("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.printf("Olá, %s. Você tem %d anos.", nome, idade);
		sc.close();
	}
}

