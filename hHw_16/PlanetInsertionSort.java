public class PlanetInsertionSort {

    public static void planetInsertionSortDemo() {
        String[] planets = {
            "Mercury", "Venus", "Earth", "Mars",
            "Jupiter", "Saturn", "Uranus", "Neptune"
        };

        System.out.println("Original order (distance from sun):");
        printOneLine(planets);

        for (int i = 1; i < planets.length; i++) {
            String key = planets[i];
            int j = i - 1;

            while (j >= 0 && planets[j].compareToIgnoreCase(key) > 0) {
                planets[j + 1] = planets[j];
                j--;
            }

            planets[j + 1] = key;

            System.out.print("After pass " + i + ": ");
            printOneLine(planets);
        }
    }

    public static void printOneLine(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        planetInsertionSortDemo();
    }
}
