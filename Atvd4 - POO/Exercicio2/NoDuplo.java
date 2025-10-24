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

    // Impressão no estilo do PDF (entrada)
    public void exibir() {
        NoDuplo aux = inicio;
        System.out.print("Entrada: null");

        if (aux == null) {
            System.out.println("->null");
            return;
        }

        // imprime o primeiro nó com "<-["valor"]"
        System.out.print("<-[" + aux.valor + "]");
        aux = aux.proximo;

        // nós do meio: "<->[valor]"
        while (aux != null) {
            System.out.print("<->[" + aux.valor + "]");
            aux = aux.proximo;
        }

        // final
        System.out.println("->null");
    }

    // Impressão no estilo do PDF (saída) - percorre a lista a partir do inicio
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

    // inverter() já corrigido (não cria nós)
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
