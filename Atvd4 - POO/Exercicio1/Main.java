public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);

        lista.exibirNormal();
        lista.inverter();
        lista.exibirInvertido();
    }
}
