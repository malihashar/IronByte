import java.util.Scanner;

public class vowel {
    public static void main( String[] args){
        Scanner scan= new Scanner(System.in);
        String str= scan.next();
        countStuff(str);
    }
    public static void countStuff(String x){
        int num=0;
        int vowel=0;
        int constant=0;
        for(int i=0;i<x.length();i++){
        char ch = Character.toLowerCase(x.charAt(i));
        if (ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
            vowel+=1;
        }
        else if(ch>='0' && ch<='9'){
            num++;
        }
        else if(ch>='a' && ch<='z'){
            constant++;
        }

        }
        System.out.println("Vowel:"+""+vowel);
        System.out.println("Constant:"+""+constant);
        System.out.println("Numbers:"+""+num);
    }

}