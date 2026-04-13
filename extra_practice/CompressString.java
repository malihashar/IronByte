import java.util.Scanner;
public class CompressString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
        compress(str);
    }
    public static void compress(String user){

    String result = "";
    int count = 1;

    for(int i = 0; i < user.length() - 1; i++){

        if(user.charAt(i) == user.charAt(i + 1)){
            count++;
        } else {
            result += user.charAt(i);
            result += count;
            count = 1;
        }
    }

    // handle last character
    result += user.charAt(user.length() - 1);
    result += count;

    // print shorter one
    if(result.length() < user.length()){
        System.out.println(result);
    } else {
        System.out.println(user);
    }
}
}
