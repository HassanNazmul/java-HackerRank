// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 07/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

public class Java_Regex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String IP = input.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." + num + "." + num + "." + num;
}
