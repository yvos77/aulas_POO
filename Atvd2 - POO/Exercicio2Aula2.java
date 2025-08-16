import java.util.Scanner;

public class Exercicio2Aula2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o operador desejado (+, -, *, /): ");
        String operacao = sc.nextLine();
        System.out.printf("Digite o primeiro número: ");
        float num1 = sc.nextFloat();
        System.out.printf("Digite o segundo número: ");
        float num2 = sc.nextFloat();
        sc.close();

        float resultado = 0;
        boolean operadorValido = true;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.printf("Não é possível dividir por zero!\n");
                    operadorValido = false;
                }
                break;
            default:
                System.out.printf("Operador inválido!\n");
                operadorValido = false;
                break;
        }

        if (operadorValido) {
            System.out.printf("A operação entre %.2f %s %.2f é igual a: %.2f", num1, operacao, num2, resultado);
        }
    }
}

