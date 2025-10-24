export {};

class No<T> {
    dado: T;
    prox: No<T> | null;

    constructor(dado: T) {
        this.dado = dado;
        this.prox = null;
    }
}

class Fila<T> {
    #inicio: No<T> | null;
    #fim: No<T> | null;
    #length: number;

    constructor() {
        this.#inicio = null;
        this.#fim = null;
        this.#length = 0;
    }

    topo(): T | undefined {
        return this.#inicio ? this.#inicio.dado : undefined;
    }

    enfileira(dado: T) {
        const novoNo = new No(dado);
        if (!this.#fim) {
            this.#inicio = novoNo;
            this.#fim = novoNo;
        } else {
            this.#fim.prox = novoNo;
            this.#fim = novoNo;
        }
        this.#length++;
    }

    desenfileira(): T | undefined {
        if (!this.#inicio) return undefined;
        const dado = this.#inicio.dado;
        this.#inicio = this.#inicio.prox;
        if (!this.#inicio) this.#fim = null;
        this.#length--;
        return dado;
    }

    tamanho(): number {
        return this.#length;
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

const fila = new Fila<number>();
fila.enfileira(10);
fila.enfileira(20);
fila.enfileira(30);

console.log("Topo da fila:", fila.topo());
console.log("Desenfileirando:", fila.desenfileira());
console.log("Topo agora:", fila.topo());
fila.listar();
console.log("Tamanho da fila:", fila.tamanho());

