import java.io.*;

public class reverse {
  public static void main(String [] args){
    try{
        BufferedReader buffer=new BufferedReader(new FileReader("reverse.txt"));
    
        int n= Integer.parseInt(buffer.readLine());
        String[] arr= new String [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=buffer.readLine();
        }
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }
        buffer.close();
    }

    catch(IOException err){
        System.out.print("error");
    }
}
}
