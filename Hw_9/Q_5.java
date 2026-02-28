import java.util.Scanner;

public class Q_5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        char a,b,c,temp;

        System.out.print("Enter 3 lower case letters: ");

        a = input.next().charAt(0);
        b = input.next().charAt(0);
        c = input.next().charAt(0);


        if(a<'a' || a>'z' || b<'a' || b>'z' || c<'a' || c>'z'){
            System.out.println("Error");
        }
        else{

            if(a>b){
                temp=a;
                a=b;
                b=temp;
            }

            if(a>c){
                temp=a;
                a=c;
                c=temp;
            }

            if(b>c){
                temp=b;
                b=c;
                c=temp;
            }

            System.out.println(a + " " + b + " " + c);

        }

    }

}