export {};

// Definição do nó
class No<T> {
    dado: T;
    prox: No<T> | null;

    constructor(dado: T) {
        this.dado = dado;
        this.prox = null;
    }
}

// Lista encadeada simples
class ListaEncadeadaSimples<T> {
    #inicio: No<T> | null;
    #length: number;

    constructor() {
        this.#inicio = null;
        this.#length = 0;
    }

    adicionar(dado: T) {
        const novoNo = new No(dado);

        if (this.#inicio === null) {
            this.#inicio = novoNo;
        } else {
            let atual = this.#inicio;
            while (atual.prox !== null) {
                atual = atual.prox;
            }
            atual.prox = novoNo;
        }

        this.#length++;
    }

    inverter() {
        let anterior: No<T> | null = null;
        let atual = this.#inicio;
        let proximo: No<T> | null = null;

        // Inversão dos ponteiros
        while (atual !== null) {
            proximo = atual.prox;
            atual.prox = anterior;
            anterior = atual;
            atual = proximo;
        }

        this.#inicio = anterior; // o último vira o novo início
    }

    // Mostra a lista no formato original
    mostrarOriginal() {
        let atual = this.#inicio;
        let texto = "";
        while (atual !== null) {
            texto += `[${atual.dado}]->`;
            atual = atual.prox;
        }
        texto += "null";
        console.log(texto);
    }

    // Mostra a lista invertida (formato visual do enunciado)
    mostrarInvertida() {
        let atual = this.#inicio;
        let texto = "null";
        while (atual !== null) {
            texto += `<-[${atual.dado}]`;
            atual = atual.prox;
        }
        console.log(texto);
    }
}

// ====== Teste ======
const lista = new ListaEncadeadaSimples<number>();
lista.adicionar(1);
lista.adicionar(2);
lista.adicionar(3);
lista.adicionar(4);

console.log("Entrada:");
lista.mostrarOriginal();

lista.inverter();

console.log("Saída:");
lista.mostrarInvertida();
