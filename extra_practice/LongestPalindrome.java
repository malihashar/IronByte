import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
        palindrome(str);
    }
    public static void palindrome(String x){
        String longest="";
        for(int i=0;i<=x.length()-1;i++){
            for(int j=i+1;j<=x.length();j++){
                String rev="";
                String count="";
                count=x.substring(i,j);
                for(int k=count.length()-1;k>=0;k--){
                    rev+=count.charAt(k);
                }
                if (rev.equalsIgnoreCase(count) && rev.length()>longest.length()){
                    longest=count;
                }

            }
        }
        System.out.println(longest);
        System.out.println("Length is :"+""+longest.length());
}
}