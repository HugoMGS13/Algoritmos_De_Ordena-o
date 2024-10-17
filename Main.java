//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2, 10, 20, 45, 2, 0, 3, 8, 9 , 100, 101, 99, 202, 1000};
        int[] array1 = {5, 3, 1, 4, 2, 10, 20, 45, 2, 0, 3, 8, 9 , 100, 101, 99, 202, 1000};

        SortAlgorithm quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();

        long tempoInicial = System.currentTimeMillis();

        int[] sortedArrayQuick = quickSort.Sort(array);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("QuickSort executado em = " + (tempoFinal - tempoInicial) + " ms");

        System.out.println("O algoritmo fez " + quickSort.getComparacoes() + " comparações e " + quickSort.getTrocas() + " trocas.");

        long tempoInicialBubble = System.currentTimeMillis();

        int[] sortedArrayBubble = bubbleSort.Sort(array1);

        long tempoFinalBubble = System.currentTimeMillis();

        System.out.println("BubbleSort executado em = " + (tempoFinalBubble - tempoInicialBubble) + " ms");

        System.out.println("O algoritmo fez " + bubbleSort.getComparacoes() + " comparações e " + bubbleSort.getTrocas() + " trocas.");

        // Exibe o array ordenado
        System.out.print("[");
        for (int num : sortedArrayBubble) {
            System.out.print(num + ", ");
        }
        System.out.print("]");
    }
}