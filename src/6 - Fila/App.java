package Fila;

public class App {
    public static void main(String[] args) {
        System.out.println("Caso 1:");
        FilaVetor<Integer> fila1 = new FilaVetor<>(5);
        System.out.println(fila1.estaVazia());
        System.out.println();

        System.out.println("Caso 2:");
        FilaVetor<Integer> fila2 = new FilaVetor<>(5);
        fila2.inserir(10);
        System.out.println(fila2.estaVazia());
        System.out.println();

        System.out.println("Caso 3:");
        FilaVetor<Integer> fila3 = new FilaVetor<>(10);
        fila3.inserir(10);
        fila3.inserir(20);
        fila3.inserir(30);

        System.out.println(fila3.retirar());
        System.out.println(fila3.retirar());
        System.out.println(fila3.retirar());
        System.out.println(fila3.estaVazia());
        System.out.println();

        System.out.println("Caso 4:");
        try {
            FilaVetor<Integer> fila4 = new FilaVetor<>(3);
            fila4.inserir(10);
            fila4.inserir(20);
            fila4.inserir(30);
            fila4.inserir(40);
        } catch (FilaCheiaException e) {
            System.out.println("FilaCheiaException lançada com sucesso!");
        }
        System.out.println();

        System.out.println("Caso 5:");
        try {
            FilaVetor<Integer> fila5 = new FilaVetor<>(5);
            fila5.retirar();
        } catch (FilaVaziaException e) {
            System.out.println("FilaVaziaException lançada com sucesso!");
        }
        System.out.println();

        System.out.println("Caso 6:");
        FilaVetor<Integer> fila6 = new FilaVetor<>(5);
        fila6.inserir(10);
        fila6.inserir(20);
        fila6.inserir(30);

        System.out.println(fila6.peek());
        System.out.println(fila6.retirar());
        System.out.println();

        System.out.println("Caso 7:");
        FilaVetor<Integer> fila7 = new FilaVetor<>(5);
        fila7.inserir(10);
        fila7.inserir(20);
        fila7.inserir(30);

        fila7.liberar();
        System.out.println(fila7.estaVazia());
    }
}
