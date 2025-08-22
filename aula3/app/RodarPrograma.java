package app;

public class RodarPrograma {
    public static void main (String[] args) {
        Carro carro = new Carro(0);
        CarroInteligente carroInt1 = new CarroInteligente(0);
        Carro carroInt2 = new CarroInteligente(0);
        carroInt1.estacionarAutomatico();
        ((CarroInteligente)carroInt2).estacionarAutomatico(); // Conversão explícita de Carro para CarroInteligente
    }
}
