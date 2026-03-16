package ListaEstaticaGenerica;
public class ListaEstatica<T> {
    private Object[] info;
    private int tamanho;

    public ListaEstatica() {
        this.info = new Object[10];
        this.tamanho = 0;
    }

    private void redimensionar() {
        int novoTamanho = info.length + 10;
        Object[] novoVetor = new Object[novoTamanho];

        for (int i = 0; i < tamanho; i++) {
            novoVetor[i] = info[i];
        }

        info = novoVetor;
    }

    public void inserir(T valor) {
        if (tamanho == this.info.length) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (valor.equals(info[i])) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        int posicao = buscar(valor);

        if (posicao != -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void liberar() {
        info = new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }
        return (T) info[posicao];
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString() {
        String resultado = "[";
        if (tamanho == 0) {
            return resultado;
        }

        for (int i = 0; i < tamanho; i++) {
            resultado += info[i];

            if (i < (tamanho - 1)) {
                resultado += ", ";
            }
        }
        resultado += "]";
        return resultado;
    }

    public void inverter() {
        int i = 0;
        int j = tamanho - 1;
        while (i < j) {
            T temp = (T) info[i];
            info[i] = info[j];
            info[j] = temp;

            i++;
            j--;
        }
    }
}
