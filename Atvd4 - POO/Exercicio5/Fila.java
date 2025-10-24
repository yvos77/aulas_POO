class No<T> {
    T dado;
    No<T> prox;

    No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class Fila<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // Retorna o valor do início da fila sem remover
    public T topo() {
        if (inicio == null) return null;
        return inicio.dado;
    }

    // Insere um novo elemento no fim da fila
    public void enfileira(T dado) {
        No<T> novoNo = new No<>(dado);
        if (fim == null) { // fila vazia
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.prox = novoNo;
            fim = novoNo;
        }
        tamanho++;
    }

    // Remove e retorna o elemento do início da fila
    public T desenfileira() {
        if (inicio == null) return null;
        T dado = inicio.dado;
        inicio = inicio.prox;
        if (inicio == null) fim = null; // fila ficou vazia
        tamanho--;
        return dado;
    }

    // Retorna o tamanho da fila
    public int getTamanho() {
        return tamanho;
    }

    // Lista os elementos da fila
    public void listar() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print("[" + atual.dado + "]->");
            atual = atual.prox;
        }
        System.out.println("null");
    }
}
