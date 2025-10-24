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

    // Retorna o valor do início da fila sem remover
    topo(): T | undefined {
        return this.#inicio ? this.#inicio.dado : undefined;
    }

    // Insere novo elemento no fim da fila
    enfileira(dado: T) {
        const novoNo = new No(dado);
        if (!this.#fim) { // fila vazia
            this.#inicio = novoNo;
            this.#fim = novoNo;
        } else {
            this.#fim.prox = novoNo;
            this.#fim = novoNo;
        }
        this.#length++;
    }

    // Remove e retorna o elemento do início da fila
    desenfileira(): T | undefined {
        if (!this.#inicio) return undefined;
        const dado = this.#inicio.dado;
        this.#inicio = this.#inicio.prox;
        if (!this.#inicio) this.#fim = null; // fila ficou vazia
        this.#length--;
        return dado;
    }

    // Retorna o tamanho da fila
    tamanho(): number {
        return this.#length;
    }

    // Lista os elementos da fila
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

// --- Teste ---
const fila = new Fila<number>();
fila.enfileira(10);
fila.enfileira(20);
fila.enfileira(30);

console.log("Topo da fila:", fila.topo()); // Esperado: 10
console.log("Desenfileirando:", fila.desenfileira()); // Esperado: 10
console.log("Topo agora:", fila.topo()); // Esperado: 20
fila.listar(); // Esperado: [20]->[30]->null
console.log("Tamanho da fila:", fila.tamanho()); // Esperado: 2
