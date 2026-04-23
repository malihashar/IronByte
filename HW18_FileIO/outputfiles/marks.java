package HW18_FileIO.input_files.outputfiles;
import java.io.*;


    public static void main(String[] args) {
        try {
            final int S = 10;
            final int T = 5;

            int[][] arr = new int[S][T];

            
            BufferedReader br = new BufferedReader(new FileReader("marks.txt"));
            String line;

            for (int i = 0; i < S; i++) {
                line = br.readLine();
                String[] parts = line.split(" ");

                for (int j = 0; j < T; j++) {
                    arr[i][j] = Integer.parseInt(parts[j]);
                }
            }
            br.close();

            
            BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));

            
            double highestAvg = 0;
            int topStudent = 0;

            for (int i = 0; i < S; i++) {
                int sum = 0;

                for (int j = 0; j < T; j++) {
                    sum += arr[i][j];
                }

                double avg = (double) sum / T;
                bw.write("Student " + i + " average: " + avg);
                bw.newLine();

                
                if (avg > highestAvg) {
                    highestAvg = avg;
                    topStudent = i;
                }
            }

            bw.newLine();
            bw.write("Top student: " + topStudent + " with average " + highestAvg);
            bw.newLine();
            bw.newLine();

            
            for (int j = 0; j < T; j++) {
                int sum = 0;

                for (int i = 0; i < S; i++) {
                    sum += arr[i][j];
                }

                double avg = (double) sum / S;
                bw.write("Test " + j + " class average: " + avg);
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
