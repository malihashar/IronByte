import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
public class StarTable {
    public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter in dimesnsion 1:");
    int n= scan.nextInt();
    System.out.print("Enter in dimesnsion 2:");
    int s= scan.nextInt();
    try{
        
        FileWriter file=new FileWriter("star.txt");
        BufferedWriter buffer=new BufferedWriter(file);
        String [][] arr= new String[n][s];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]="*";
            }
        }
         for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    buffer.write(arr[i][j]);
                }
                buffer.newLine(); 
            }
        buffer.close();
    }
    catch(IOException err){
        System.out.println("error");
    }
}
}
