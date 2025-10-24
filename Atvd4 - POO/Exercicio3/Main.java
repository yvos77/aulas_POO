public class Main {
    public static void main(String[] args) {
        ListaEncadeadaOrdenada<Integer> lista = new ListaEncadeadaOrdenada<>();
        lista.inserir(5);
        lista.inserir(3);
        lista.inserir(7);
        lista.inserir(4);

        lista.listar(); // Saída: [3]->[4]->[5]->[7]->null
    }
}
