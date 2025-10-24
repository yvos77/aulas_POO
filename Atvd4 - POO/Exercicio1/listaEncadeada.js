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
var _ListaEncadeadaSimples_inicio, _ListaEncadeadaSimples_length;

var No = /** @class */ (function () {
    function No(dado) {
        this.dado = dado;
        this.prox = null;
    }
    return No;
}());

var ListaEncadeadaSimples = /** @class */ (function () {
    function ListaEncadeadaSimples() {
        _ListaEncadeadaSimples_inicio.set(this, void 0);
        _ListaEncadeadaSimples_length.set(this, void 0);
        __classPrivateFieldSet(this, _ListaEncadeadaSimples_inicio, null, "f");
        __classPrivateFieldSet(this, _ListaEncadeadaSimples_length, 0, "f");
    }
    ListaEncadeadaSimples.prototype.adicionar = function (dado) {
        var _a;
        var novoNo = new No(dado);
        if (__classPrivateFieldGet(this, _ListaEncadeadaSimples_inicio, "f") === null) {
            __classPrivateFieldSet(this, _ListaEncadeadaSimples_inicio, novoNo, "f");
        }
        else {
            var atual = __classPrivateFieldGet(this, _ListaEncadeadaSimples_inicio, "f");
            while (atual.prox !== null) {
                atual = atual.prox;
            }
            atual.prox = novoNo;
        }
        __classPrivateFieldSet(this, _ListaEncadeadaSimples_length, (_a = __classPrivateFieldGet(this, _ListaEncadeadaSimples_length, "f"), _a++, _a), "f");
    };
    ListaEncadeadaSimples.prototype.inverter = function () {
        var anterior = null;
        var atual = __classPrivateFieldGet(this, _ListaEncadeadaSimples_inicio, "f");
        var proximo = null;

        while (atual !== null) {
            proximo = atual.prox;
            atual.prox = anterior;
            anterior = atual;
            atual = proximo;
        }
        __classPrivateFieldSet(this, _ListaEncadeadaSimples_inicio, anterior, "f");
    };

    ListaEncadeadaSimples.prototype.mostrarOriginal = function () {
        var atual = __classPrivateFieldGet(this, _ListaEncadeadaSimples_inicio, "f");
        var texto = "";
        while (atual !== null) {
            texto += "[".concat(atual.dado, "]->");
            atual = atual.prox;
        }
        texto += "null";
        console.log(texto);
    };

    ListaEncadeadaSimples.prototype.mostrarInvertida = function () {
        var atual = __classPrivateFieldGet(this, _ListaEncadeadaSimples_inicio, "f");
        var texto = "null";
        while (atual !== null) {
            texto += "<-[".concat(atual.dado, "]");
            atual = atual.prox;
        }
        console.log(texto);
    };
    return ListaEncadeadaSimples;
}());
_ListaEncadeadaSimples_inicio = new WeakMap(), _ListaEncadeadaSimples_length = new WeakMap();

var lista = new ListaEncadeadaSimples();
lista.adicionar(1);
lista.adicionar(2);
lista.adicionar(3);
lista.adicionar(4);
console.log("Entrada:");
lista.mostrarOriginal();
lista.inverter();
console.log("Saída:");
lista.mostrarInvertida();
