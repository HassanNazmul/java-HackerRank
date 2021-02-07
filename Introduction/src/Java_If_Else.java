// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_If_Else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        String output = "";
        if (N % 2 == 1) {
            output = "Weird";
        } else {
            if (N >= 6 && N <= 20) {
                output = "Weird";
            } else {
                output = "Not Weird";
            }
        }

        System.out.println(output);
    }
}
