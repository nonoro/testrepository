package _20154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {
                3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1
        };

        char[] chars = sc.nextLine().toCharArray();

        int sum = 0;
        for (char ch : chars) {
            sum += x[ch - 'A'];

            if (sum > 9) {
                sum %= 10;
            }
        }

        if (sum % 2 == 0) {
            System.out.println("You're the winner?");
        } else {
            System.out.println("I'm a winner!");
        }

    }
}
