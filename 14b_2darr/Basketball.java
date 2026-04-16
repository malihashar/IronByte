import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] games = new int[5][2];
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < games[i].length; j++) {
                games[i][j] = scan.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < games.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    sum1 += games[i][j];
                } else if (j == 1) {
                    sum2 += games[i][j];
                }
            }
        }
        System.out.println("Team A total: " + sum1);
        System.out.println("Team B total: " + sum2);

        for (int i = 0; i < games.length; i++) {
            int a = games[i][0];
            int b = games[i][1];
            System.out.print("Game " + (i + 1) + ": ");
            if (a - b == 0) {
                System.out.println("tie");
            } else if ((a - b) > 0) {
                System.out.println("Team A won");
            } else if ((a - b) < 0) {
                System.out.println("Team B won");
            }
        }
        scan.close();
    }
}
