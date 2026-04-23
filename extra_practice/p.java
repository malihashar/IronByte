import java.util.Scanner;
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String input= scan.next();
        System.out.println("Enter a word2:");
        String input2= scan.next();
        anagram(input,input2);
        
    }
   public static void anagram(String str, String str2) {

  str = clean(str).toLowerCase();
  str2 = clean(str2).toLowerCase();

  if (str.length() != str2.length()) {
    System.out.println("not an anagram");
    return;
  }

  for (int i = 0; i < str.length(); i++) {
    boolean found = false;

    for (int j = 0; j < str2.length(); j++) {

      if (str.charAt(i) == str2.charAt(j)) {
        // remove matched character from str2
        str2 = str2.substring(0, j) + str2.substring(j + 1);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("not an anagram");
      return;
    }
  }

  System.out.println("Yes it's an anagram");
}
    public static String clean(String str){
        str= str.replaceAll("\\W","");
        return str;
    }
    public static String clean2(String str){
        str= str.replaceAll("\\W","");
        return str;
    }
 

