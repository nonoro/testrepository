package _2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            int number = i;
            for (String j : String.valueOf(i).split("")) {
                number += Integer.parseInt(j);
            }
            if (number == input) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
}

