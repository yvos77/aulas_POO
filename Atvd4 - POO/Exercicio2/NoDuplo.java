class NoDuplo {
    int valor;
    NoDuplo anterior;
    NoDuplo proximo;

    NoDuplo(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDupla {
    NoDuplo inicio, fim;

    public void inserir(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void exibir() {
        NoDuplo aux = inicio;
        System.out.print("Entrada: null");

        if (aux == null) {
            System.out.println("->null");
            return;
        }

        System.out.print("<-[" + aux.valor + "]");
        aux = aux.proximo;

        while (aux != null) {
            System.out.print("<->[" + aux.valor + "]");
            aux = aux.proximo;
        }

        System.out.println("->null");
    }

    public void exibirInvertido() {
        NoDuplo aux = inicio;
        System.out.print("Saída: null");

        if (aux == null) {
            System.out.println("->null");
            return;
        }

        System.out.print("<-[" + aux.valor + "]");
        aux = aux.proximo;

        while (aux != null) {
            System.out.print("<->[" + aux.valor + "]");
            aux = aux.proximo;
        }

        System.out.println("->null");
    }

    public void inverter() {
        NoDuplo atual = inicio;
        NoDuplo temp = null;

        while (atual != null) {
            temp = atual.anterior;
            atual.anterior = atual.proximo;
            atual.proximo = temp;
            atual = atual.anterior;
        }

        if (temp != null) {
            NoDuplo aux = inicio;
            inicio = temp.anterior;
            fim = aux;
        }
    }
}

