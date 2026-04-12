import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter lower bound:");
        int x=scan.nextInt();
        System.out.print("Enter lower bound:");
        int y=scan.nextInt();
        if(y>x){
         perfect(x,y);
        }
        else{
            System.out.println("Lower bound cant be greater than upper");
        }
    }
    public static void perfect(int lower,int upper){
        
        if(lower==1){
            lower++;
        }
        for(int i=lower;i<=upper;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if (i%j==0){
                    sum+=j;
                }
              
                }
                if(sum==i){
                    System.out.println(""+i+"");
            }
        }
    }
}
