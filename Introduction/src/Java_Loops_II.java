// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_Loops_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
