import java.util.Random;

public class SortingComparison {

    public static void fillRandom(int[] arr, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void printFirst100(int[] arr) {
        int limit = Math.min(100, arr.length);
        for (int i = 0; i < limit; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = new int[1000];

        fillRandom(data, 0, 500);
        System.out.println("First 100 numbers (original):");
        printFirst100(data);

        int[] oneSort = copyArray(data);
        long start = System.nanoTime();
        selectionSort(oneSort);
        long end = System.nanoTime();
        long microseconds = (end - start) / 1000;

        System.out.println("\nFirst 100 numbers after sort:");
        printFirst100(oneSort);
        System.out.println("Time for first sort (Selection): " + microseconds + " microseconds");

        fillRandom(data, 0, 500);

        int[] arrSelection = copyArray(data);
        int[] arrInsertion = copyArray(data);
        int[] arrBubble = copyArray(data);

        start = System.nanoTime();
        selectionSort(arrSelection);
        end = System.nanoTime();
        System.out.println("\nSelection Sort time: " + ((end - start) / 1000) + " microseconds");

        start = System.nanoTime();
        insertionSort(arrInsertion);
        end = System.nanoTime();
        System.out.println("Insertion Sort time: " + ((end - start) / 1000) + " microseconds");

        start = System.nanoTime();
        bubbleSort(arrBubble);
        end = System.nanoTime();
        System.out.println("Bubble Sort time: " + ((end - start) / 1000) + " microseconds");
    }
}
