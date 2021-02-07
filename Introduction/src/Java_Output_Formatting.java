// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = input.next();
            int x = input.nextInt();
            //Complete this line
            System.out.format("%-15s%03d%n", s1, x);

        }
        System.out.println("================================");
    }
}
