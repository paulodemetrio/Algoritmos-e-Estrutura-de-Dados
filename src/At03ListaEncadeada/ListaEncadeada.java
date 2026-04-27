package At03ListaEncadeada;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoLista<T> novoNo = new NoLista<>(valor);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        }
        return false;
    }

    public NoLista<T> buscar(T valor) {
        NoLista<T> ponteiro = primeiro;

        while (ponteiro != null) {
            if (ponteiro.getInfo().equals(valor)) {
                return ponteiro;
            }
            ponteiro = ponteiro.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoLista<T> remover = buscar(valor);

        if (remover == null) {
            return;
        }

        if (remover == primeiro) {
            primeiro = primeiro.getProximo();
            return;
        }

        NoLista<T> ponteiro = primeiro;

        while (ponteiro.getProximo() != remover) {
            ponteiro = ponteiro.getProximo();
        }

        ponteiro.setProximo(remover.getProximo());

    }

    public int obterComprimento() {
        NoLista<T> ponteiro = primeiro;
        int contador = 0;
        while (ponteiro != null) {
            contador++;
            ponteiro = ponteiro.getProximo();
        }
        return contador;
    }

    public NoLista<T> obterNo(int posicao) {
        if (posicao < 0) {
            throw new IndexOutOfBoundsException();
        }

        NoLista<T> ponteiro = primeiro;
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

    public String toString() {
        String resultado = "[";
        if (obterComprimento() == 0) {
            return resultado + "-]";
        }

        NoLista<T> ponteiro = primeiro;

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
