package At01ListaEstatica;

public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int[] novoVetor = new int[info.length + 10];

        for (int i = 0; i < tamanho; i++) {
            novoVetor[i] = info[i];
        }

        info = novoVetor;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(int valor){
        for (int i = 0; i < tamanho; i++) {
            if (valor == info[i]){
                return i;
            }
        }
        return 0;
    }

    public void retirar(int valor){
        int posicao = buscar(valor);

        if (posicao != -1){
            for (int i = posicao; i < tamanho; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    
}
