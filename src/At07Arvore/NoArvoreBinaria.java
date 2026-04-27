package At07Arvore;

public class NoArvoreBinaria<T> {

    private T info;
    private NoArvoreBinaria<T> esq;
    private NoArvoreBinaria<T> dir;

    public NoArvoreBinaria(T info) {
        this.info = info;
        this.esq = null;
        this.dir = null;
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        this.info = info;
        this.esq = esq;
        this.dir = dir;
    }

    public T getInfo() {
        return info;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esq;
    }

    public void setEsquerda(NoArvoreBinaria<T> esq) {
        this.esq = esq;
    }

    public NoArvoreBinaria<T> getDireita() {
        return dir;
    }

    public void setDireita(NoArvoreBinaria<T> dir) {
        this.dir = dir;
    }
}