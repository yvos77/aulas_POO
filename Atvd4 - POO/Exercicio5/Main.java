// --- Teste ---
public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileira(10);
        fila.enfileira(20);
        fila.enfileira(30);

        System.out.println("Topo da fila: " + fila.topo()); // Esperado: 10
        System.out.println("Desenfileirando: " + fila.desenfileira()); // Esperado: 10
        System.out.println("Topo agora: " + fila.topo()); // Esperado: 20
        fila.listar(); // Esperado: [20]->[30]->null
        System.out.println("Tamanho da fila: " + fila.getTamanho()); // Esperado: 2
    }
}