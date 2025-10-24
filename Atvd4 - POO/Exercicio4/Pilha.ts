export {};

class No<T> {
    dado: T;
    prox: No<T> | null;

    constructor(dado: T) {
        this.dado = dado;
        this.prox = null;
    }
}

class Pilha<T> {
    #topo: No<T> | null;
    #length: number;

    constructor() {
        this.#topo = null;
        this.#length = 0;
    }

    topo(): T | undefined {
        return this.#topo ? this.#topo.dado : undefined;
    }

    empilha(dado: T) {
        const novoNo = new No(dado);
        novoNo.prox = this.#topo;
        this.#topo = novoNo;
        this.#length++;
    }

    desempilha(): T | undefined {
        if (!this.#topo) return undefined;
        const dado = this.#topo.dado;
        this.#topo = this.#topo.prox;
        this.#length--;
        return dado;
    }

    tamanho(): number {
        return this.#length;
    }
}

const pilha = new Pilha<number>();
pilha.empilha(10);
pilha.empilha(20);
pilha.empilha(30);

console.log("Topo da pilha:", pilha.topo());
console.log("Desempilhando:", pilha.desempilha());
console.log("Topo agora:", pilha.topo());
console.log("Tamanho da pilha:", pilha.tamanho());

