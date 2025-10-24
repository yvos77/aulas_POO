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

    // Retorna o valor do topo sem remover
    topo(): T | undefined {
        return this.#topo ? this.#topo.dado : undefined;
    }

    // Insere um novo elemento no topo
    empilha(dado: T) {
        const novoNo = new No(dado);
        novoNo.prox = this.#topo;
        this.#topo = novoNo;
        this.#length++;
    }

    // Remove e retorna o elemento do topo
    desempilha(): T | undefined {
        if (!this.#topo) return undefined;
        const dado = this.#topo.dado;
        this.#topo = this.#topo.prox;
        this.#length--;
        return dado;
    }

    // Retorna o tamanho da pilha
    tamanho(): number {
        return this.#length;
    }
}

// --- Teste ---
const pilha = new Pilha<number>();
pilha.empilha(10);
pilha.empilha(20);
pilha.empilha(30);

console.log("Topo da pilha:", pilha.topo()); // Esperado: 30
console.log("Desempilhando:", pilha.desempilha()); // Esperado: 30
console.log("Topo agora:", pilha.topo()); // Esperado: 20
console.log("Tamanho da pilha:", pilha.tamanho()); // Esperado: 2
