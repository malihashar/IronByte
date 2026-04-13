import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt();
        String s= scan.next();

        tri(n,s);
    }
    public static void tri(int num,String sym){
        int count=0;
        int e=0;
        for(int i=1;i<=num;i++){
            for(int s=1;s<=num-i;s++){
                System.out.print("");
            }
            
            for(int j=0;j<=count;j++){ 
                System.out.print(sym); 
                e=j;
            }
            System.out.println();
             count+=2;
             if(e==num-1){
                count-=2;
             }
            
        }
    }
}
