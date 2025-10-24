"use strict";
var __classPrivateFieldSet = (this && this.__classPrivateFieldSet) || function (receiver, state, value, kind, f) {
    if (kind === "m") throw new TypeError("Private method is not writable");
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a setter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot write private member to an object whose class did not declare it");
    return (kind === "a" ? f.call(receiver, value) : f ? f.value = value : state.set(receiver, value)), value;
};
var __classPrivateFieldGet = (this && this.__classPrivateFieldGet) || function (receiver, state, kind, f) {
    if (kind === "a" && !f) throw new TypeError("Private accessor was defined without a getter");
    if (typeof state === "function" ? receiver !== state || !f : !state.has(receiver)) throw new TypeError("Cannot read private member from an object whose class did not declare it");
    return kind === "m" ? f : kind === "a" ? f.call(receiver) : f ? f.value : state.get(receiver);
};
var _ListaEncadeadaDupla_inicio, _ListaEncadeadaDupla_fim, _ListaEncadeadaDupla_length;
Object.defineProperty(exports, "__esModule", { value: true });
class No {
    constructor(dado) {
        this.dado = dado;
        this.prox = null;
        this.ant = null;
    }
}
class ListaEncadeadaDupla {
    constructor() {
        _ListaEncadeadaDupla_inicio.set(this, void 0);
        _ListaEncadeadaDupla_fim.set(this, void 0);
        _ListaEncadeadaDupla_length.set(this, void 0);
        __classPrivateFieldSet(this, _ListaEncadeadaDupla_inicio, null, "f");
        __classPrivateFieldSet(this, _ListaEncadeadaDupla_fim, null, "f");
        __classPrivateFieldSet(this, _ListaEncadeadaDupla_length, 0, "f");
    }
    adicionar(dado) {
        var _a;
        const novoNo = new No(dado);
        if (__classPrivateFieldGet(this, _ListaEncadeadaDupla_inicio, "f") === null) {
            __classPrivateFieldSet(this, _ListaEncadeadaDupla_inicio, novoNo, "f");
            __classPrivateFieldSet(this, _ListaEncadeadaDupla_fim, novoNo, "f");
        }
        else {
            novoNo.ant = __classPrivateFieldGet(this, _ListaEncadeadaDupla_fim, "f");
            __classPrivateFieldGet(this, _ListaEncadeadaDupla_fim, "f").prox = novoNo;
            __classPrivateFieldSet(this, _ListaEncadeadaDupla_fim, novoNo, "f");
        }
        __classPrivateFieldSet(this, _ListaEncadeadaDupla_length, (_a = __classPrivateFieldGet(this, _ListaEncadeadaDupla_length, "f"), _a++, _a), "f");
    }
    inverter() {
        let atual = __classPrivateFieldGet(this, _ListaEncadeadaDupla_inicio, "f");
        let temp = null;
        // Inverte os ponteiros de todos os nós
        while (atual !== null) {
            temp = atual.ant;
            atual.ant = atual.prox;
            atual.prox = temp;
            atual = atual.ant;
        }
        // Troca início e fim
        temp = __classPrivateFieldGet(this, _ListaEncadeadaDupla_inicio, "f");
        __classPrivateFieldSet(this, _ListaEncadeadaDupla_inicio, __classPrivateFieldGet(this, _ListaEncadeadaDupla_fim, "f"), "f");
        __classPrivateFieldSet(this, _ListaEncadeadaDupla_fim, temp, "f");
    }
    mostrar() {
        let atual = __classPrivateFieldGet(this, _ListaEncadeadaDupla_inicio, "f");
        let texto = "null";
        while (atual !== null) {
            // início da lista → seta “<-”
            if (atual === __classPrivateFieldGet(this, _ListaEncadeadaDupla_inicio, "f")) {
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
_ListaEncadeadaDupla_inicio = new WeakMap(), _ListaEncadeadaDupla_fim = new WeakMap(), _ListaEncadeadaDupla_length = new WeakMap();
// ===== Teste =====
const lista = new ListaEncadeadaDupla();
lista.adicionar(1);
lista.adicionar(2);
lista.adicionar(3);
lista.adicionar(4);
console.log("Entrada:");
lista.mostrar();
lista.inverter();
console.log("Saída:");
lista.mostrar();
