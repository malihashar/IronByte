public class Pattern {

    public static void main(String[] args) {
        int height = 5;

        for (int row = 1; row <= height; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
