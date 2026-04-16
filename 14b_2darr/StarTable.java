import java.util.Scanner;

public class StarTable {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int user= scan.nextInt();
        int user2= scan.nextInt();
        table(user,user2);
    }
    public static void table(int num,int num2){
        String t [][]= new String[num][num2];
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                t[i][j]="*";
            
            }

        }
        System.out.println((t));
    }
}

