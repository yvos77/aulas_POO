class No<T> {
    dado: T;
    prox: No<T> | null;

    constructor(dado: T) {
        this.dado = dado;
        this.prox = null;
    }
}

class ListaEncadeadaOrdenada<T> {
    #inicio: No<T> | null;
    #length: number;

    constructor() {
        this.#inicio = null;
        this.#length = 0;
    }

    inserir(dado: T) {
        const novoNo = new No(dado);

        if (!this.#inicio || (dado as unknown as number) < (this.#inicio.dado as unknown as number)) {
            novoNo.prox = this.#inicio;
            this.#inicio = novoNo;
        } else {
            let atual = this.#inicio;
            while (atual.prox && (dado as unknown as number) > (atual.prox.dado as unknown as number)) {
                atual = atual.prox;
            }
            novoNo.prox = atual.prox;
            atual.prox = novoNo;
        }
        this.#length++;
    }

    listar() {
        let atual = this.#inicio;
        let saida = '';
        while (atual) {
            saida += `[${atual.dado}]->`;
            atual = atual.prox;
        }
        saida += 'null';
        console.log(saida);
    }
}

const lista = new ListaEncadeadaOrdenada<number>();
lista.inserir(5);
lista.inserir(3);
lista.inserir(7);
lista.inserir(4);

lista.listar();

