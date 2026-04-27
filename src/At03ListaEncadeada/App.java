package At03ListaEncadeada;

public class App {
    public static void main(String[] args) {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        // Verificar se é reconhecida lista vazia
        System.out.println(lista.estaVazia());

        // Adicionar o número 5 na lista e verificar se é reconhecida lista não vazia
        lista.inserir(5);
        System.out.println(lista.estaVazia());

        // Conferir que tenha sido retornado nó e o nó contenha 5
        NoLista<Integer> primeiroNo = lista.obterNo(0);
        System.out.println("Primeiro valor da lista: " + primeiroNo.getInfo());
        System.out.println(lista.toString());

        // Adicionar os números 10 e 15
        lista.inserir(10);
        lista.inserir(15);
        System.out.println(lista.toString());

        // Validar busca de dados na lista na primeira posição
        lista.inserir(20);
        System.out.println("Buscar 20: " + lista.buscar(20).getInfo());

        // Validar busca de dados no meio da lista
        System.out.println("Buscar 15: " + lista.buscar(15).getInfo());

        // Validar busca de dado inexistente
        System.out.println("Buscar 50: " + lista.buscar(50));

        // Validar exclusão do primeiro elemento da lista
        lista.retirar(20);
        System.out.println(lista.toString());

        // Validar exclusão de elemento do meio da lista
        lista.inserir(20);
        lista.retirar(15);
        System.out.println(lista.toString());

        // Criar nova lista
        ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();
        lista2.inserir(5);
        lista2.inserir(10);
        lista2.inserir(15);
        lista2.inserir(20);

        // Validar que obterNo() retorna nó na posição 0
        System.out.println("obterNo(0): " + lista2.obterNo(0).getInfo());

        // Validar que obterNo() retorna nó da última posição
        System.out.println("obterNo(3): " + lista2.obterNo(3).getInfo());

        // Testar obter a posição 10
        try {
            lista2.obterNo(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exceção lançada");
        }

        // Validar comprimento da lista vazia
        ListaEncadeada<Integer> lista3 = new ListaEncadeada<>();
        System.out.println("Comprimento lista vazia: " + lista3.obterComprimento());

        // Adicionar os números 5, 10, 15 e 20 e validar o comprimento
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println("Comprimento lista: " + lista3.obterComprimento());
    }
}