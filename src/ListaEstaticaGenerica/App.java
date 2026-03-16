package ListaEstaticaGenerica;
public class App {
    public static void main(String[] args) {
        ListaEstatica<Double> lista = new ListaEstatica<>();
        System.out.println("Iniciando as listas!");

        // Criar uma lista. Adicionar os dados 5.5, 10.6, 15.7 e 20.8
        lista.inserir(5.5);
        lista.inserir(10.6);
        lista.inserir(15.7);
        lista.inserir(20.8);

        // toString() deve resultar em “5,10,15,20”
        System.out.println("Lista 1: " + lista.toString());

        // getTamanho() deve resultar em 4
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        // buscar(15) deve resultar em 2.
        System.out.println("Posição do valor 15.7: " + lista.buscar(15.7));

        // buscar(30) deve resultar em -1
        System.out.println("Buscando valor 30: " + lista.buscar(30.0));

        // retirar o elemento 10
        System.out.println("Retirando valor 10.6");
        lista.retirar(10.6);

        // // toString() deve resultar em “5 15 20”
        System.out.println("Lista 1: " + lista.toString());

        // // getTamanho() deve resultar em 3
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        // Criar uma lista. Adicionar 15 números na lista (de 1 à 15)
        ListaEstatica<Double> lista2 = new ListaEstatica<>();

        lista2.inserir(1.1);
        lista2.inserir(2.2);
        lista2.inserir(3.3);
        lista2.inserir(4.4);
        lista2.inserir(5.5);
        lista2.inserir(6.6);
        lista2.inserir(7.7);
        lista2.inserir(8.8);
        lista2.inserir(9.9);
        lista2.inserir(10.1);
        lista2.inserir(11.2);
        lista2.inserir(12.3);
        lista2.inserir(13.4);
        lista2.inserir(14.5);
        lista2.inserir(15.6);

        System.out.println("Lista 2: " + lista2.toString());

        System.out.println("Tamanho da lista: " + lista2.getTamanho());

        // Criar uma lista. Adicionar os dados 5.1, 10.2, 15.3 e 20.4
        ListaEstatica<Double> lista3 = new ListaEstatica<>();

        lista3.inserir(5.1);
        lista3.inserir(10.2);
        lista3.inserir(15.3);
        lista3.inserir(20.4);

        // ** Exibindo a lista novamente para validar se foi limpada e se os novos valores estão incluídos

        System.out.println("Lista 3: " + lista3.toString());

        // obterElemento(3) deverá resultar em 20
        System.out.println("Elemento na posição 3: " + lista3.obterElemento(3));

        // obterElemento(5) deverá lançar uma exceção
        // ** Descomentar a linha abaixo para testar a exceção
        // System.out.println("Elemento na posição 5: " + lista.obterElemento(5));

        // Invocar o método liberar()
        System.out.println("Limpando a lista...");
        lista.liberar();

        // estaVazia() deverá resultar em true
        System.out.println("A lista está vazia? " + lista.estaVazia());

        // invertendo a lista2
        lista2.inverter();
        System.out.println("Lista 2 invertida: " + lista2.toString());
    }
}
