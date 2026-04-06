package Pilha;

public interface Pilha<T> {
    void push(T t);
    T pop();
    T peek();
    boolean estaVazio();
    void liberar();
}
