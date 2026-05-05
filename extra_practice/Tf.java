import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("data.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));

            String line;
            int[][] arr = new int[3][4];
            int i = 0;

            
            while ((line = buffer.readLine()) != null) {
                String[] part = line.split(" ");
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = Integer.parseInt(part[j]);
                }
                i++;
            }

            int[] total = new int[3];
            int max = 0;
            int snum = 0;

            
            for (int r = 0; r < 3; r++) {
                int sum = 0;

                for (int c = 0; c < 4; c++) {
                    sum += arr[r][c];
                }

                total[r] = sum;
                int avg = sum / 4;

                if (avg > max) {
                    max = avg;
                    snum = r;
                }
            }

            
            int low = Integer.MAX_VALUE;
            int day = 0;

            for (int c = 0; c < 4; c++) {
                int sum = 0;

                for (int r = 0; r < 3; r++) {
                    sum += arr[r][c];
                }

                if (sum < low) {
                    low = sum;
                    day = c;
                }
            }

            
            out.write("Store Totals:\n");
            for (int r = 0; r < 3; r++) {
                out.write("Store " + r + ": " + total[r] + "\n");
            }

            out.write("\nTop Store: " + snum + " with avg " + max + "\n");
            out.write("Lowest Day: " + day + "\n");

            out.close();
            buffer.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}