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
var _Pilha_topo, _Pilha_length;
Object.defineProperty(exports, "__esModule", { value: true });
class No {
    constructor(dado) {
        this.dado = dado;
        this.prox = null;
    }
}
class Pilha {
    constructor() {
        _Pilha_topo.set(this, void 0);
        _Pilha_length.set(this, void 0);
        __classPrivateFieldSet(this, _Pilha_topo, null, "f");
        __classPrivateFieldSet(this, _Pilha_length, 0, "f");
    }
    
    topo() {
        return __classPrivateFieldGet(this, _Pilha_topo, "f") ? __classPrivateFieldGet(this, _Pilha_topo, "f").dado : undefined;
    }

    empilha(dado) {
        var _a;
        const novoNo = new No(dado);
        novoNo.prox = __classPrivateFieldGet(this, _Pilha_topo, "f");
        __classPrivateFieldSet(this, _Pilha_topo, novoNo, "f");
        __classPrivateFieldSet(this, _Pilha_length, (_a = __classPrivateFieldGet(this, _Pilha_length, "f"), _a++, _a), "f");
    }

    desempilha() {
        var _a;
        if (!__classPrivateFieldGet(this, _Pilha_topo, "f"))
            return undefined;
        const dado = __classPrivateFieldGet(this, _Pilha_topo, "f").dado;
        __classPrivateFieldSet(this, _Pilha_topo, __classPrivateFieldGet(this, _Pilha_topo, "f").prox, "f");
        __classPrivateFieldSet(this, _Pilha_length, (_a = __classPrivateFieldGet(this, _Pilha_length, "f"), _a--, _a), "f");
        return dado;
    }

    tamanho() {
        return __classPrivateFieldGet(this, _Pilha_length, "f");
    }
}
_Pilha_topo = new WeakMap(), _Pilha_length = new WeakMap();

const pilha = new Pilha();
pilha.empilha(10);
pilha.empilha(20);
pilha.empilha(30);
console.log("Topo da pilha:", pilha.topo());
console.log("Desempilhando:", pilha.desempilha());
console.log("Topo agora:", pilha.topo());
console.log("Tamanho da pilha:", pilha.tamanho());
