import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Addnums {
    public static void main(String[] args){
     FileReader file;
        BufferedReader buffer;
        String input;
        int sum=0;
        try // attempt to read from input stream
        {
            file = new FileReader ("AddNumbers.txt");
            buffer = new BufferedReader (file);
            while ((input = buffer.readLine ()) != null){ 
                System.out.println (input);
                sum+=Integer.parseInt(input);
            }
            buffer.close();
        }
        
        catch (IOException err)
        {
            System.out.println ("error");
        }
System.out.print(sum);
}
}
