public class Chart {

    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for (int n = 5; n <= 40; n++) {
            int square = n * n;
            int cube = n * n * n;
            System.out.println(n + "\t" + square + "\t" + cube);
        }
    }
}
