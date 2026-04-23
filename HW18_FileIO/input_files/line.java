package HW18_FileIO.input_files;
import java.io.*;
import java.io.IOException;

public class line {
    public static void main(String[] args) {

        FileReader file;
        BufferedReader buffer;
        int user;  // must be int for read()

        try {
            file = new FileReader("line.txt");
            buffer = new BufferedReader(file);

            user = buffer.read();

            while (user != -1) {
                //if (user != ' ' && user != '\n' && user != '\r') { ms xie you can add this line if you want
                    System.out.println((char) user);
                //}
                user = buffer.read(); 
            }

            buffer.close();
        }
        catch (IOException err) {
            System.out.println("error");
        }
    }
}