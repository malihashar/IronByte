public class RandomTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 16; i++) {
            int number = (int) (Math.random() * 100) + 1; 
            System.out.print(number + " ");

            if (i % 4 == 0) {
                System.out.println();
            }
        }
    }
}
