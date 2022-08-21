package _20053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();


        for (int i = 0; i < Integer.valueOf(input1); i++) {
            String input2 = sc.nextLine();

            int max = -1000000;
            int min = 1000000;

            String[] input3 = sc.nextLine().split(" ");
            for (int j = 0; j < Integer.valueOf(input2); j++) {
                if (min > Integer.valueOf(input3[j])) {
                    min = Integer.valueOf(input3[j]);
                }

                if (max < Integer.valueOf(input3[j])) {
                    max = Integer.valueOf(input3[j]);
                }
            }
            System.out.println(min + " " + max);
        }
    }
}




