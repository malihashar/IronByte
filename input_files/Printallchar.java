import java.io.*;

public class Printallchar {
    public static void main(String [] args){
        FileReader file;
        BufferedReader buffer;
        String user;

        try{
            file= new FileReader("PrintAllChar.txt");
            buffer= new BufferedReader(file);
            user= buffer.readLine();
            for(int i=0;i<3;i++){
                for(int j=0;j<user.length();j++){
                    System.out.println(user.charAt(j));
                }
            }
            buffer.close();
        }
        
        catch(IOException err){
            System.out.println("error");
        }
    }
}
