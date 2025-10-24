// --- Teste ---
public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        pilha.empilha(10);
        pilha.empilha(20);
        pilha.empilha(30);

        System.out.println("Topo da pilha: " + pilha.topo()); // Esperado: 30
        System.out.println("Desempilhando: " + pilha.desempilha()); // Esperado: 30
        System.out.println("Topo agora: " + pilha.topo()); // Esperado: 20
        System.out.println("Tamanho da pilha: " + pilha.getTamanho()); // Esperado: 2
    }
}