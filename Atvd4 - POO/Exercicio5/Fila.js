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
var _Fila_inicio, _Fila_fim, _Fila_length;
Object.defineProperty(exports, "__esModule", { value: true });
class No {
    constructor(dado) {
        this.dado = dado;
        this.prox = null;
    }
}
class Fila {
    constructor() {
        _Fila_inicio.set(this, void 0);
        _Fila_fim.set(this, void 0);
        _Fila_length.set(this, void 0);
        __classPrivateFieldSet(this, _Fila_inicio, null, "f");
        __classPrivateFieldSet(this, _Fila_fim, null, "f");
        __classPrivateFieldSet(this, _Fila_length, 0, "f");
    }
    // Retorna o valor do início da fila sem remover
    topo() {
        return __classPrivateFieldGet(this, _Fila_inicio, "f") ? __classPrivateFieldGet(this, _Fila_inicio, "f").dado : undefined;
    }
    // Insere novo elemento no fim da fila
    enfileira(dado) {
        var _a;
        const novoNo = new No(dado);
        if (!__classPrivateFieldGet(this, _Fila_fim, "f")) { // fila vazia
            __classPrivateFieldSet(this, _Fila_inicio, novoNo, "f");
            __classPrivateFieldSet(this, _Fila_fim, novoNo, "f");
        }
        else {
            __classPrivateFieldGet(this, _Fila_fim, "f").prox = novoNo;
            __classPrivateFieldSet(this, _Fila_fim, novoNo, "f");
        }
        __classPrivateFieldSet(this, _Fila_length, (_a = __classPrivateFieldGet(this, _Fila_length, "f"), _a++, _a), "f");
    }
    // Remove e retorna o elemento do início da fila
    desenfileira() {
        var _a;
        if (!__classPrivateFieldGet(this, _Fila_inicio, "f"))
            return undefined;
        const dado = __classPrivateFieldGet(this, _Fila_inicio, "f").dado;
        __classPrivateFieldSet(this, _Fila_inicio, __classPrivateFieldGet(this, _Fila_inicio, "f").prox, "f");
        if (!__classPrivateFieldGet(this, _Fila_inicio, "f"))
            __classPrivateFieldSet(this, _Fila_fim, null, "f"); // fila ficou vazia
        __classPrivateFieldSet(this, _Fila_length, // fila ficou vazia
        (_a = __classPrivateFieldGet(this, _Fila_length, "f"), _a--, _a), "f");
        return dado;
    }
    // Retorna o tamanho da fila
    tamanho() {
        return __classPrivateFieldGet(this, _Fila_length, "f");
    }
    // Lista os elementos da fila
    listar() {
        let atual = __classPrivateFieldGet(this, _Fila_inicio, "f");
        let saida = '';
        while (atual) {
            saida += `[${atual.dado}]->`;
            atual = atual.prox;
        }
        saida += 'null';
        console.log(saida);
    }
}
_Fila_inicio = new WeakMap(), _Fila_fim = new WeakMap(), _Fila_length = new WeakMap();
// --- Teste ---
const fila = new Fila();
fila.enfileira(10);
fila.enfileira(20);
fila.enfileira(30);
console.log("Topo da fila:", fila.topo()); // Esperado: 10
console.log("Desenfileirando:", fila.desenfileira()); // Esperado: 10
console.log("Topo agora:", fila.topo()); // Esperado: 20
fila.listar(); // Esperado: [20]->[30]->null
console.log("Tamanho da fila:", fila.tamanho()); // Esperado: 2
