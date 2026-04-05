import java.util.Scanner;

/**
 * CipherX — Grade 10 style: loops, if, String methods only (no split).
 * Uses: substring, charAt, indexOf, length, equals, compareTo, replace
 */
public class CipherX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "";

        // ----- INPUT VALIDATION -----
        while (true) {
            System.out.println("Enter a sentence:");
            sentence = sc.nextLine();

            // Count words using indexOf only (no split)
            int wordCount = countWordsWithIndexOf(sentence);

            boolean hasDigit = false;
            boolean hasUpper = false;

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                if (c >= '0' && c <= '9') {
                    hasDigit = true;
                }
                if (c >= 'A' && c <= 'Z') {
                    hasUpper = true;
                }
            }

            if (wordCount >= 5 && wordCount % 2 == 1 && hasDigit && hasUpper) {
                break;
            } else {
                System.out.println("Invalid input. Try again.\n");
            }
        }

        // ----- WORD EXTRACTION -----
        int firstSpace = sentence.indexOf(" ");
        int lastSpace = sentence.lastIndexOf(" ");

        String firstWord = sentence.substring(0, firstSpace);
        String lastWord = sentence.substring(lastSpace + 1);

        // Middle word: after (wordCount/2) spaces — same idea as counting from the left
        int wCount = countWordsWithIndexOf(sentence);
        int middleIndex = wCount / 2; // which space marks end of words before middle (0-based word index)
        String middleWord = extractMiddleWord(sentence, middleIndex);

        // ----- ANALYSIS -----
        System.out.println("\n--- Analysis ---");
        printWordInfo("First", firstWord);
        printWordInfo("Middle", middleWord);
        printWordInfo("Last", lastWord);

        // ----- TRANSFORMATIONS -----

        // First word: reverse with a loop, then mask vowels a–z and A–Z with *
        String reversed = "";
        for (int i = firstWord.length() - 1; i >= 0; i--) {
            reversed += firstWord.charAt(i);
        }
        String firstTrans = maskVowelsWithStar(reversed);

        // Middle word: every second character uppercase (index 1, 3, 5, ...), then replace first char with #
        String middleTrans = "";
        for (int i = 0; i < middleWord.length(); i++) {
            char c = middleWord.charAt(i);
            if (i % 2 == 1) {
                c = toUpperChar(c);
            }
            middleTrans += c;
        }
        char firstMiddle = middleWord.charAt(0);
        middleTrans = middleTrans.replace(firstMiddle, '#');
        middleTrans = middleTrans.replace(toUpperChar(firstMiddle), '#');
        middleTrans = middleTrans.replace(toLowerChar(firstMiddle), '#');

        // Last word: compareTo first word, label HIGH / LOW / EQUAL, then remove first & last char of LAST WORD only
        int comp = lastWord.compareTo(firstWord);
        String label;
        if (comp > 0) {
            label = "HIGH";
        } else if (comp < 0) {
            label = "LOW";
        } else {
            label = "EQUAL";
        }
        String lastCore = lastWord;
        if (lastWord.length() > 2) {
            lastCore = lastWord.substring(1, lastWord.length() - 1);
        }
        String lastTrans = lastCore + label;

        System.out.println("\n--- Transformations ---");
        System.out.println("First -> " + firstTrans);
        System.out.println("Middle -> " + middleTrans);
        System.out.println("Last -> " + lastTrans);

        // ----- FINAL SENTENCE -----
        String finalSentence = sentence.replace(" ", "_");
        for (int d = 0; d <= 9; d++) {
            finalSentence = finalSentence.replace("" + d, "@");
        }

        System.out.println("\n--- Final Sentence ---");
        System.out.println(finalSentence);
        System.out.println("Total characters: " + finalSentence.length());

        // ----- HIDDEN CODE -----
        int firstVowel = findFirstVowel(sentence);
        int lastDigit = findLastDigit(sentence);

        System.out.println("\n--- Hidden Code ---");
        if (lastDigit == -1) {
            System.out.println("(No digit — skipped.)");
        } else if (firstVowel == -1) {
            System.out.println("(No vowel — skipped.)");
        } else if (firstVowel < lastDigit) {
            System.out.println(sentence.substring(firstVowel, lastDigit + 1));
        } else {
            System.out.println("(First vowel is not before last digit — skipped.)");
        }

        sc.close();
    }

    /** Count words by walking spaces with indexOf (no split). */
    public static int countWordsWithIndexOf(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 1;
        int pos = 0;
        while (true) {
            int sp = s.indexOf(" ", pos);
            if (sp == -1) {
                break;
            }
            count++;
            pos = sp + 1;
        }
        return count;
    }

    /** Middle word when word count is odd: word at index (total/2) in 0-based word list. */
    public static String extractMiddleWord(String sentence, int middleIndex) {
        int spacesSeen = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spacesSeen++;
                if (spacesSeen == middleIndex) {
                    int nextSpace = sentence.indexOf(" ", i + 1);
                    if (nextSpace == -1) {
                        nextSpace = sentence.length();
                    }
                    return sentence.substring(i + 1, nextSpace);
                }
            }
        }
        return "";
    }

    public static void printWordInfo(String label, String word) {
        System.out.println(label + ": " + word);
        System.out.println("Length: " + word.length());
        System.out.println("First char: " + word.charAt(0));
        System.out.println("Last char: " + word.charAt(word.length() - 1));
        System.out.println();
    }

    public static String maskVowelsWithStar(String s) {
        String out = s;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < vowels.length(); i++) {
            out = out.replace(vowels.charAt(i), '*');
        }
        return out;
    }

    /** Simple uppercase for A–Z / a–z only (no Character class needed for logic). */
    public static char toUpperChar(char c) {
        if (c >= 'a' && c <= 'z') {
            return (char) (c - 'a' + 'A');
        }
        return c;
    }

    public static char toLowerChar(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c - 'A' + 'a');
        }
        return c;
    }

    public static int findFirstVowel(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = toLowerChar(c);
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return i;
            }
        }
        return -1;
    }

    public static int findLastDigit(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                return i;
            }
        }
        return -1;
    }
}
