export {};

class No<T> {
    dado: T;
    prox: No<T> | null;
    ant: No<T> | null;

    constructor(dado: T) {
        this.dado = dado;
        this.prox = null;
        this.ant = null;
    }
}

class ListaEncadeadaDupla<T> {
    #inicio: No<T> | null;
    #fim: No<T> | null;
    #length: number;

    constructor() {
        this.#inicio = null;
        this.#fim = null;
        this.#length = 0;
    }

    adicionar(dado: T) {
        const novoNo = new No(dado);

        if (this.#inicio === null) {
            this.#inicio = novoNo;
            this.#fim = novoNo;
        } else {
            novoNo.ant = this.#fim;
            this.#fim!.prox = novoNo;
            this.#fim = novoNo;
        }

        this.#length++;
    }

    inverter() {
        let atual = this.#inicio;
        let temp: No<T> | null = null;

        // Inverte os ponteiros de todos os nós
        while (atual !== null) {
            temp = atual.ant;
            atual.ant = atual.prox;
            atual.prox = temp;
            atual = atual.ant;
        }

        // Troca início e fim
        temp = this.#inicio;
        this.#inicio = this.#fim;
        this.#fim = temp;
    }

    mostrar() {
        let atual = this.#inicio;
        let texto = "null";

        while (atual !== null) {
            // início da lista → seta “<-”
            if (atual === this.#inicio) {
                texto += `<-[${atual.dado}]`;
            }
            // fim da lista → seta “->”
            else if (atual.prox === null) {
                texto += `<->[${atual.dado}]->`;
            }
            // meio da lista → seta “<->”
            else {
                texto += `<->[${atual.dado}]`;
            }
            atual = atual.prox;
        }

        texto += "null";
        console.log(texto);
    }
}

// ===== Teste =====
const lista = new ListaEncadeadaDupla<number>();
lista.adicionar(1);
lista.adicionar(2);
lista.adicionar(3);
lista.adicionar(4);

console.log("Entrada:");
lista.mostrar();

lista.inverter();

console.log("Saída:");
lista.mostrar();
