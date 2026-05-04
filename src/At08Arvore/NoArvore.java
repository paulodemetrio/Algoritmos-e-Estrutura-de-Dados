package At08Arvore;

public class NoArvore<T> {

    private T info;
    private NoArvore<T> primeiro, proximo;

    public NoArvore(T info) {
        this.info = info;
        this.primeiro = null;
        this.proximo = null;
    }

    public void inserirFilho(NoArvore<T> filho) {
        if (this.primeiro == null){
            this.primeiro = filho;
        } else {
            filho.proximo = this.primeiro;
            this.primeiro = filho;
        }
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvore<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore<T> proximo) {
        this.proximo = proximo;
    }
}