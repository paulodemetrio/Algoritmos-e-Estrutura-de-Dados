package At06Fila;

public class FilaVaziaException extends RuntimeException {

    public FilaVaziaException() {
        super("Fila está vazia!");
    }

    public FilaVaziaException(String mensagem) {
        super(mensagem);
    }
}
