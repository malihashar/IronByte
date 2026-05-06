import java.io.*;

public class attendance {
    public static void main(String[] args){
        try{
            FileReader file= new FileReader("students.txt");
            BufferedReader buffer= new BufferedReader(file);
            BufferedWriter in= new BufferedWriter(new FileWriter("output.txt"));
            int [][] arr= new int[4][5];
            int x=0;
            String line;
            while((line=buffer.readLine())!=null){
                    String[] parts= line.split(" ");
                for(int j=0;j<5;j++){
                    arr[x][j]=Integer.parseInt(parts[j]);
                }
                x++;
            }
            int count=0;
            int ab=0;
            int[] at= new int[4];
            for(int r=0;r<4;r++){
                count=0;
                ab=0;
                for(int j=0;j<5;j++){
                    if(arr[r][j]==1){
                        count++;
                    }
                    else if(arr[r][j]==0){
                        ab++;
                    }
                }
                if(ab>=2){
                    at[r]=-1;
                }
                else{
                    at[r]=count;
                }
            }
            for(int s=0;s<4;s++){
                in.write("student:"+ s +" "+"attendence:"+at[s]);
                in.newLine();
            }
                int count2=0;
                int low=Integer.MAX_VALUE;
                int day=0;
            for(int j=0;j<5;j++){
                count2=0;
                for(int i=0;i<4;i++){
                    count2+=arr[i][j];
                }
                if(count2<=low){
                    low=count2;
                    day=j;
                }
            }
            int tc=0;
            //e
            for(int i=0;i<4;i++){
                tc=0;
                for(int j=0;j<2;j++){
                    if(arr[i][j]==1){
                    if(arr[i][j]==arr[i][j+1] && arr[i][j+1]==arr[i][j+2]){
                        tc++;
                    }
                }

                }
                if(tc>=1){
                    in.newLine();
                    in.write("student:"+i+" "+"has three consecutive day attendence.");
                    in.newLine();
                }
            }
            for(int i=0;i<4;i++){
                for(int j=0;j<5;j++){
                    if(arr[i][j]==1){arr[i][j]=arr[i][j]*100;}
                }
            }
            in.newLine();
            in.write("day:"+day+" "+"has the lowest attendence of:"+low);
            in.newLine();


            buffer.close();
            in.close();
        }
        catch(IOException iox){
            System.out.print("Error");
        }

    }
}
