public class ShakeSortDoubles {

    public static void shakeSort(double[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    double temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] values = {5.5, 3.2, 9.8, 1.1, 4.0, 2.7};

        System.out.println("Before shake sort:");
        printArray(values);

        shakeSort(values);

        System.out.println("After shake sort:");
        printArray(values);
    }
}
