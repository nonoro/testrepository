package _2748;

import java.util.Scanner;

public class Main {
    static long[] dp = new long[91];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fivo(input));

    }

    public static long fivo(int input) {
        if (input == 0) {
            return 0;
        }
        if (input == 1) {
            return 1;
        }

        if (dp[input] != 0) {
            return dp[input];
        }
        dp[input] = fivo(input - 2) + fivo(input - 1);


        return dp[input];
    }
}
