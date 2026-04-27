package At04ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
    private NoListaDupla<T> primeiro;

    public ListaDuplamenteEncadeada() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla<T> novoNo = new NoListaDupla<>(valor);
        novoNo.setProximo(primeiro);
        novoNo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novoNo);
        }
        primeiro = novoNo;
    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        }
        return false;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> ponteiro = primeiro;

        while (ponteiro != null) {
            if (ponteiro.getInfo().equals(valor)) {
                return ponteiro;
            }
            ponteiro = ponteiro.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> remover = buscar(valor);

        if (remover == null) {
            return;
        }

        NoListaDupla<T> anterior = remover.getAnterior();
        NoListaDupla<T> proximo = remover.getProximo();

        if (anterior == null && proximo == null) {
            primeiro = null;
        } else if (anterior == null) {
            primeiro = proximo;
            proximo.setAnterior(null);
        } else if (proximo == null) {
            anterior.setProximo(null);
        } else {
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
        }
    }

    public int obterComprimento() {
        NoListaDupla<T> ponteiro = primeiro;
        int contador = 0;
        while (ponteiro != null) {
            contador++;
            ponteiro = ponteiro.getProximo();
        }
        return contador;
    }

    public NoListaDupla<T> obterNo(int posicao) {
        if (posicao < 0) {
            throw new IndexOutOfBoundsException();
        }

        NoListaDupla<T> ponteiro = primeiro;
        int indice = 0;

        while (ponteiro != null) {

            if (indice == posicao) {
                return ponteiro;
            }

            ponteiro = ponteiro.getProximo();
            indice++;
        }

        throw new IndexOutOfBoundsException();
    }

    public String exibirOrdemInversa() {
        String resultado = "[";
        if (primeiro == null) {
            return resultado + "-]";
        }

        NoListaDupla<T> ponteiro = primeiro;

        while (ponteiro.getProximo() != null) {
            ponteiro = ponteiro.getProximo();
        }
        while (ponteiro != null) {
            resultado += ponteiro.getInfo();
            if (ponteiro.getAnterior() != null) {
                resultado += ", ";
            }
            ponteiro = ponteiro.getAnterior();
        }
        return resultado += "]";
    }

    public void liberar() {
        NoListaDupla<T> ponteiro = primeiro;

        while (ponteiro != null) {
            NoListaDupla<T> auxiliar = ponteiro.getProximo();

            ponteiro.setProximo(null);
            ponteiro.setAnterior(null);

            ponteiro = auxiliar;
        }
    }

    public String toString() {
        String resultado = "[";
        if (obterComprimento() == 0) {
            return resultado + "-]";
        }

        NoListaDupla<T> ponteiro = primeiro;

        while (ponteiro != null) {

            resultado += ponteiro.getInfo();
            if (ponteiro.getProximo() != null) {
                resultado += ", ";
            }
            ponteiro = ponteiro.getProximo();
        }
        return resultado += "]";
    }
}
