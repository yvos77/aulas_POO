package app;

public class CarroInteligente extends Carro {
    public CarroInteligente (int velocidade) {
        super(velocidade);
    }

    public void estacionarAutomatico() {
        System.out.println("Estacionando automaticamente!");
        this.frear();
        this.velocidade = 0;
    }


}
