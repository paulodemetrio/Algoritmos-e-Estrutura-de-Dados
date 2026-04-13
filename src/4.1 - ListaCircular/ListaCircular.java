package ListaCircular;

public class ListaCircular<T> {
    private NoLista<T> primeiro;

    public ListaCircular() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoLista<T> novoNo = new NoLista<>(valor);

        if (estaVazia() == true) {
            primeiro = novoNo;
            novoNo.setProximo(novoNo);
        } else {
            NoLista<T> aux = primeiro;

            while (aux.getProximo() != primeiro) {
                aux = aux.getProximo();
            }
            aux.setProximo(novoNo);
            novoNo.setProximo(primeiro);
        }

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
        if (primeiro == null) {
            return null;
        }

        NoLista<T> ponteiro = primeiro;

        do {
            if (ponteiro.getInfo().equals(valor)) {
                return ponteiro;
            }
            ponteiro = ponteiro.getProximo();
        } while (ponteiro != primeiro);

        return null;
    }

    public void retirar(T valor) {
        NoLista<T> remover = buscar(valor);

        if (remover == null) {
            return;
        }

        if (remover == primeiro && primeiro.getProximo() == primeiro) {
            primeiro = null;
            return;
        }

        if (remover == primeiro) {
            NoLista<T> ultimo = primeiro;

            while (ultimo.getProximo() != primeiro) {
                ultimo = ultimo.getProximo();
            }

            primeiro = primeiro.getProximo();
            ultimo.setProximo(primeiro);
            return;
        }

        NoLista<T> ponteiro = primeiro;

        while (ponteiro.getProximo() != remover) {
            ponteiro = ponteiro.getProximo();
        }

        ponteiro.setProximo(remover.getProximo());

    }

    public int obterComprimento() {

        if (primeiro == null) {
            return 0;
        }

        int contador = 0;
        NoLista<T> ponteiro = primeiro;

        do {
            contador++;
            ponteiro = ponteiro.getProximo();
        } while (ponteiro != primeiro);

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
        if (primeiro == null) {
            return resultado += "-]";
        }

        NoLista<T> ponteiro = primeiro;

        do {
            resultado += ponteiro.getInfo();
            ponteiro = ponteiro.getProximo();
            if (ponteiro != primeiro) {
                resultado += " -> ";
            }
        } while (ponteiro != primeiro);
        
        return resultado += "]";
    }
}
