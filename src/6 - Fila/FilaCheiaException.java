package Fila;

public class FilaCheiaException extends RuntimeException {

    public FilaCheiaException() {
        super("Fila está cheia!");
    }

    public FilaCheiaException(String mensagem) {
        super(mensagem);
    }
}
