public class Carro {
    String marca;
    String modelo;
    String cor;
    int ano;
    boolean ligado;

    // métodos
	void ligar() { ligado = true; }
	void desligar() { ligado = false; }
	void alterarCor(String novaCor) {
        cor = novaCor;
    }

public static void main(String args[]) {
    Carro meuCarro = new Carro();
    meuCarro.marca = "Honda";
    meuCarro.modelo = "Civic";
    meuCarro.cor = "vermelho";
    meuCarro.ligado = false;
    meuCarro.ano = 2010;

    System.out.println("Utilizando println: " + meuCarro.marca + ", " + meuCarro.modelo);
    System.out.printf("Utilizando printf: %s, %s\n", meuCarro.marca, meuCarro.modelo);
    System.out.printf("Antes de ligar: %s\n", meuCarro.ligado);
    meuCarro.ligar();
    System.out.printf("Depois de ligar: %s\n", meuCarro.ligado);
    }
}
