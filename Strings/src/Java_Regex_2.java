// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here
// Java Regex 2 - Duplicate Words

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Regex_2 {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
