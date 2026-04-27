package At07Arvore;

public class NoArvoreBinaria {
    private int info;
    private NoArvoreBinaria esq;
    private NoArvoreBinaria dir;

    public NoArvoreBinaria (int info, NoArvoreBinaria esq, NoArvoreBinaria dir) {
        this.info = info;
        this.esq = esq;
        this.dir = dir;
    }

    public int getInfo() {
        return info;
    }
    
    public NoArvoreBinaria getEsquerda() {
        return esq;
    }

    public void setEsquerda(NoArvoreBinaria esq) {
        this.esq = esq;
    }
    
    public NoArvoreBinaria getDireita() {
        return dir;
    }

    public void setDireita(NoArvoreBinaria dir) {
        this.dir = dir;
    }

    
}
