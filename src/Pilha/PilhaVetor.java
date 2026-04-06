package Pilha;

public class PilhaVetor<T> implements Pilha<T> {

    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.info = new Object[limite];
        this.tamanho = 0;
    }

    public void push(T t) {
        if (tamanho == limite) {
            throw new PilhaCheiaException("Pilha cheia");
        }
        info[tamanho] = t;
        tamanho++;
    }

    public T pop() {
        if (estaVazio()) {
            throw new PilhaVaziaException("Pilha vazia");
        }
        T valor = (T) info[tamanho - 1];
        info[tamanho - 1] = null;
        tamanho--;
        return valor;
    }

    public T peek() {
        if (estaVazio()) {
            throw new PilhaVaziaException("Pilha vazia");
        }
        return (T) info[tamanho - 1];
    }

    public boolean estaVazio() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    public void liberar() {
        while (!estaVazio()) {
            pop();
        }
    }
}
