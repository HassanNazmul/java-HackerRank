// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs in int
        int i = input.nextInt();
        double d = input.nextDouble();
        input.nextLine();
        String s = input.nextLine();

        // Printing Output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
