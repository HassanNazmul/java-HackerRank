// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (input.hasNextLine()) {
            System.out.println(i + " " + input.nextLine());
            i++;
        }
    }
}
