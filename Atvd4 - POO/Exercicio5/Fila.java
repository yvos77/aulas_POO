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

    public T topo() {
        if (inicio == null) return null;
        return inicio.dado;
    }

    public void enfileira(T dado) {
        No<T> novoNo = new No<>(dado);
        if (fim == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.prox = novoNo;
            fim = novoNo;
        }
        tamanho++;
    }

    public T desenfileira() {
        if (inicio == null) return null;
        T dado = inicio.dado;
        inicio = inicio.prox;
        if (inicio == null) fim = null;
        tamanho--;
        return dado;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void listar() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print("[" + atual.dado + "]->");
            atual = atual.prox;
        }
        System.out.println("null");
    }
}

