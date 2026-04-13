package Fila;

public class FilaVetor<T> implements Fila<T> {
    private Object[] info;
    private int limite, tamanho, inicio;

    public FilaVetor(int limite) {
        info = new Object[limite];
        this.limite = limite;
        tamanho = 0;
        inicio = 0;
    }

    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException();
        }
        int posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return (T) info[inicio];
    }

    public T retirar() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        T valor = peek();
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    public void liberar() {
        while (!estaVazia()) {
            retirar();
        }
        inicio = 0;
    }

    public String toString() {
        String resultado = "[";

        if (estaVazia()) {
            return resultado + "-]";
        }

        int i = inicio;

        for (int cont = 0; cont < tamanho; cont++) {
            resultado += info[i];

            if (cont < tamanho - 1) {
                resultado += ", ";
            }

            i = (i + 1) % info.length;
        }

        resultado += "]";
        return resultado;
    }
    
    public int getLimite() {
        return limite;
    }

}
