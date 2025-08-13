public class Retangulo {
    double comprimento;
    double largura;

    double calcularArea() {
        return comprimento * largura;
    }

    public static void main(String args[]) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.comprimento = 12.9;
        retangulo1.largura = 7.9;

        System.out.printf("A área do retângulo é: %.2f\n", retangulo1.calcularArea());
    }
}
