// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 08/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();
        // Destination Code is Here

        s = removeLeadingNonLetters(s);

        //Check special cases
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        // Split on all non-alphabetic characters
        String[] words = s.split("[^a-zA-Z]+");

        // Print output
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}

