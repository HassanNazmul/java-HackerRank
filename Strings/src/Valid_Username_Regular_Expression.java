// Author: Nazmul Hassan
// Submit: HackerRank
// Date: 08/02/2021
// Language: JAVA

// Hacker Rank Solution From Here

import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";

    public static class Valid_Username_Regular_Expression {
        private static final Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            int n = Integer.parseInt(input.nextLine());
            while (n-- != 0) {
                String userName = input.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }
}