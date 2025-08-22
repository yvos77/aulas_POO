package app;

public class Carro {
    
    protected int velocidade;

    public Carro(int velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() { velocidade++; }
    public void frear() { velocidade--; }
}
