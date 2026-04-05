import java.util.Scanner;

/**
Name: Muhammad Hashar
Date: February 26, 2026
Teacher: Ms. Xie
Assignment: Selection - (CipherX.java)
*/

public class CipherX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "";

        // input validation
        while (true) {
            System.out.println("Enter a sentence:");
            sentence = sc.nextLine();

            int wordCount = 0;
            if (sentence.length() > 0) wordCount = 1;

            boolean hasDigit = false;
            boolean hasUpper = false;

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);

                if (c == ' ') wordCount++;

                if (c >= '0' && c <= '9') hasDigit = true;

                if (c >= 'A' && c <= 'Z') hasUpper = true;
            }

            if (wordCount >= 5 && wordCount % 2 == 1 && hasDigit && hasUpper) {
                break;
            } else {
                System.out.println("Invalid input. Try again.\n");
            }
        }

        try {

            // word extraction
            int firstSpace = sentence.indexOf(" ");
            int lastSpace = sentence.lastIndexOf(" ");

            String firstWord = sentence.substring(0, firstSpace);
            String lastWord = sentence.substring(lastSpace + 1);

            // find middle word
            int wordCount = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') wordCount++;
            }

            int middlePos = wordCount / 2;

            int spacesSeen = 0;
            String middleWord = "";

            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    spacesSeen++;

                    if (spacesSeen == middlePos) {
                        int nextSpace = sentence.indexOf(" ", i + 1);
                        if (nextSpace == -1) nextSpace = sentence.length();

                        middleWord = sentence.substring(i + 1, nextSpace);
                        break;
                    }
                }
            }

            // analysis
            System.out.println("\n Analysis");

            System.out.println("First: " + firstWord);
            System.out.println("Length: " + firstWord.length());
            System.out.println("First char: " + firstWord.charAt(0));
            System.out.println("Last char: " + firstWord.charAt(firstWord.length() - 1));

            System.out.println();

            System.out.println("Middle: " + middleWord);
            System.out.println("Length: " + middleWord.length());
            System.out.println("First char: " + middleWord.charAt(0));
            System.out.println("Last char: " + middleWord.charAt(middleWord.length() - 1));

            System.out.println();

            System.out.println("Last: " + lastWord);
            System.out.println("Length: " + lastWord.length());
            System.out.println("First char: " + lastWord.charAt(0));
            System.out.println("Last char: " + lastWord.charAt(lastWord.length() - 1));

            // transformations

            // first word
            String reversed = "";
            for (int i = firstWord.length() - 1; i >= 0; i--) {
                char c = firstWord.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    reversed += "*";
                } else {
                    reversed += c;
                }
            }

            // middle word
            String middleTrans = "";
            char firstChar = middleWord.charAt(0);

            for (int i = 0; i < middleWord.length(); i++) {
                char c = middleWord.charAt(i);

                if (i % 2 == 1 && c >= 'a' && c <= 'z') {
                    c = (char)(c - 32);
                }

                if (c == firstChar || c == (char)(firstChar - 32) || c == (char)(firstChar + 32)) {
                    middleTrans += "#";
                } else {
                    middleTrans += c;
                }
            }

            // last word
            int comp = lastWord.compareTo(firstWord);
            String lastTrans = "";

            if (lastWord.length() > 2) {
                lastTrans = lastWord.substring(1, lastWord.length() - 1);
            } else {
                lastTrans = lastWord;
            }

            if (comp > 0) {
                lastTrans += "HIGH";
            } else if (comp < 0) {
                lastTrans += "LOW";
            } else {
                lastTrans += "EQUAL";
            }

            System.out.println("\n--- Transformations ---");
            System.out.println("First -> " + reversed);
            System.out.println("Middle -> " + middleTrans);
            System.out.println("Last -> " + lastTrans);

            // final sentence
            String finalSentence = sentence.replace(" ", "_");

            for (int i = 0; i <= 9; i++) {
                finalSentence = finalSentence.replace("" + i, "@");
            }

            System.out.println("\n--- Final Sentence ---");
            System.out.println(finalSentence);
            System.out.println("Total characters: " + finalSentence.length());

            // hidden code
            int firstVowel = -1;
            int lastDigit = -1;

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);

                if (firstVowel == -1 &&
                    (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                     c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                    firstVowel = i;
                }

                if (c >= '0' && c <= '9') {
                    lastDigit = i;
                }
            }

            System.out.println("\n--- Hidden Code ---");

            if (firstVowel != -1 && lastDigit != -1 && firstVowel < lastDigit) {
                System.out.println(sentence.substring(firstVowel, lastDigit + 1));
            } else {
                System.out.println("No hidden code");
            }

        } catch (Exception e) {
            System.out.println("Error: Something went wrong. Try a different sentence.");
        }

        sc.close();
    }
}