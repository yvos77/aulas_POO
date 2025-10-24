class No<T extends Comparable<T>> { // T precisa ser comparável para ordenar
    T dado;
    No<T> prox;

    No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class ListaEncadeadaOrdenada<T extends Comparable<T>> {
    private No<T> inicio;
    private int tamanho;

    public ListaEncadeadaOrdenada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    // Inserir elemento mantendo ordem crescente
    public void inserir(T dado) {
        No<T> novoNo = new No<>(dado);

        // Se a lista estiver vazia ou o dado for menor que o início
        if (inicio == null || dado.compareTo(inicio.dado) < 0) {
            novoNo.prox = inicio;
            inicio = novoNo;
        } else {
            No<T> atual = inicio;
            while (atual.prox != null && dado.compareTo(atual.prox.dado) > 0) {
                atual = atual.prox;
            }
            // Inserir no meio ou no final
            novoNo.prox = atual.prox;
            atual.prox = novoNo;
        }
        tamanho++;
    }

    // Listar elementos
    public void listar() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print("[" + atual.dado + "]->");
            atual = atual.prox;
        }
        System.out.println("null");
    }

    public int getTamanho() {
        return tamanho;
    }
}
