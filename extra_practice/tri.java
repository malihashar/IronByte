import java.util.Scanner;
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
System.out.println("Enter the number of rows:");
int row= scan.nextInt();
System.out.println("Enter the indicator:");
String ind= scan.next();
Triangle(row,ind);


}
public static void Triangle(int num,String x){
    int count=0;
    for(int i=1;i<=row;i++){
        for(int j=0;j<=count;j++){
            System.out.print(x);
        }
        count+=2;
        System.out.println();
    }
}