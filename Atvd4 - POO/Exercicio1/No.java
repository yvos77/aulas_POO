class No {
    int valor;
    No proximo;

    No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaSimples {
    No inicio;

    public void inserir(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    public void exibirNormal() {
        No aux = inicio;
        System.out.print("Entrada: ");
        while (aux != null) {
            System.out.print("[" + aux.valor + "] -> ");
            aux = aux.proximo;
        }
        System.out.println("null");
    }

    public void exibirInvertido() {
        System.out.print("Saída: ");
        System.out.print("null ");
        No aux = inicio;
        while (aux != null) {
            System.out.print("<- [" + aux.valor + "] ");
            aux = aux.proximo;
        }
        System.out.println();
    }

    public void inverter() {
        No anterior = null;
        No atual = inicio;
        No proximo = null;

        while (atual != null) {
            proximo = atual.proximo;
            atual.proximo = anterior;
            anterior = atual;
            atual = proximo;
        }

        inicio = anterior;
    }
}

