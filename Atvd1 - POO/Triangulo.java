public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    boolean formaTriangulo() {
        if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoC + ladoB > ladoA)) {
            return true;
        } else {
            return false;
        }
    }
    String obterTipo() {
        if (formaTriangulo() == false) {
            return null;
        } else if (ladoA == ladoB && ladoB == ladoC){
            return "Equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String args[]) {
        Triangulo trangulo1 = new Triangulo();
        trangulo1.ladoA = 1;
        trangulo1.ladoB = 1;
        trangulo1.ladoC = 12;

        System.out.printf("Forma um triângulo?: %b\n", trangulo1.formaTriangulo());
        System.out.printf("O tipo do triângulo é: %s\n",trangulo1.obterTipo());
    }
}
