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
var _ListaEncadeadaOrdenada_inicio, _ListaEncadeadaOrdenada_length;
class No {
    constructor(dado) {
        this.dado = dado;
        this.prox = null;
    }
}
class ListaEncadeadaOrdenada {
    constructor() {
        _ListaEncadeadaOrdenada_inicio.set(this, void 0);
        _ListaEncadeadaOrdenada_length.set(this, void 0);
        __classPrivateFieldSet(this, _ListaEncadeadaOrdenada_inicio, null, "f");
        __classPrivateFieldSet(this, _ListaEncadeadaOrdenada_length, 0, "f");
    }
    inserir(dado) {
        var _a;
        const novoNo = new No(dado);
        if (!__classPrivateFieldGet(this, _ListaEncadeadaOrdenada_inicio, "f") || dado < __classPrivateFieldGet(this, _ListaEncadeadaOrdenada_inicio, "f").dado) {
            novoNo.prox = __classPrivateFieldGet(this, _ListaEncadeadaOrdenada_inicio, "f");
            __classPrivateFieldSet(this, _ListaEncadeadaOrdenada_inicio, novoNo, "f");
        }
        else {
            let atual = __classPrivateFieldGet(this, _ListaEncadeadaOrdenada_inicio, "f");
            while (atual.prox && dado > atual.prox.dado) {
                atual = atual.prox;
            }
            novoNo.prox = atual.prox;
            atual.prox = novoNo;
        }
        __classPrivateFieldSet(this, _ListaEncadeadaOrdenada_length, (_a = __classPrivateFieldGet(this, _ListaEncadeadaOrdenada_length, "f"), _a++, _a), "f");
    }
    listar() {
        let atual = __classPrivateFieldGet(this, _ListaEncadeadaOrdenada_inicio, "f");
        let saida = '';
        while (atual) {
            saida += `[${atual.dado}]->`;
            atual = atual.prox;
        }
        saida += 'null';
        console.log(saida);
    }
}
_ListaEncadeadaOrdenada_inicio = new WeakMap(), _ListaEncadeadaOrdenada_length = new WeakMap();
const lista = new ListaEncadeadaOrdenada();
lista.inserir(5);
lista.inserir(3);
lista.inserir(7);
lista.inserir(4);
lista.listar(); // Saída: [3]->[4]->[5]->[7]->null
