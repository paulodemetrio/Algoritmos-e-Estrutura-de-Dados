package At07Arvore;

public class App {
    public static void main(String[] args) {

        // CASO 1 - árvore vazia
        ArvoreBinaria<Integer> arv1 = new ArvoreBinaria<>();

        System.out.println("CASO 1");
        System.out.println("estaVazia(): " + arv1.estaVazia());
        System.out.println();


        // CASO 2 - árvore não vazia
        // adicionar nó 5
        ArvoreBinaria<Integer> arv2 = new ArvoreBinaria<>();
        arv2.setRaiz(new NoArvoreBinaria<>(5));
        System.out.println("CASO 2");
        System.out.println("estaVazia(): " + arv2.estaVazia());
        System.out.println();

        // CASO 3 EM DIANTE
        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> n6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n4);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3, n5, n6);

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, n2, n3);

        ArvoreBinaria<Integer> arv3 = new ArvoreBinaria<>();
        arv3.setRaiz(n1);

        // CASO 3 - toString()
        System.out.println("CASO 3");
        System.out.println("toString(): " + arv3.toString());
        System.out.println();

        // CASO 4 - pertence 1
        System.out.println("CASO 4");
        System.out.println("Pertence(1): " + arv3.pertence(1));
        System.out.println();

        // CASO 5 - pertence 3
        System.out.println("CASO 5");
        System.out.println("Pertence(3): " + arv3.pertence(3));
        System.out.println();

        // CASO 6 - pertence 6
        System.out.println("CASO 6");
        System.out.println("Pertence(6): " + arv3.pertence(6));
        System.out.println();

        // CASO 7 - pertence 10
        System.out.println("CASO 7");
        System.out.println("Pertence(10): " + arv3.pertence(10));
        System.out.println();

        // CASO 8 - contar nós
        System.out.println("CASO 8");
        System.out.println("contarNos(): " + arv3.contarNos());
        System.out.println();
    }
}
