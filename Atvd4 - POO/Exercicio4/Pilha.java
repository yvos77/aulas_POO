class No<T> {
    T dado;
    No<T> prox;

    No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class Pilha<T> {
    private No<T> topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    // Retorna o valor do topo sem remover
    public T topo() {
        if (topo == null) return null;
        return topo.dado;
    }

    // Insere um novo elemento no topo
    public void empilha(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.prox = topo;
        topo = novoNo;
        tamanho++;
    }

    // Remove e retorna o elemento do topo
    public T desempilha() {
        if (topo == null) return null;
        T dado = topo.dado;
        topo = topo.prox;
        tamanho--;
        return dado;
    }

    // Retorna o tamanho da pilha
    public int getTamanho() {
        return tamanho;
    }
}
