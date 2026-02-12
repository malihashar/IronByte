

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
    
}
