public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);

        lista.exibir();
        lista.inverter();
        lista.exibirInvertido();
    }
}
