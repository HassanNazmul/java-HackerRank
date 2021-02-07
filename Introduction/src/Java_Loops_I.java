// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d%n", N, i, i * N);
        }
    }
}
