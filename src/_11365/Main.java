package _11365;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            String str1 = scanner.nextLine();
            if (str1.equals("END")) {
                run = false;
            } else {
                String[] str2 = str1.split("");
                for (int i = str2.length - 1; i >= 0; i--) {
                System.out.print(str2[i]);
            }
            System.out.println();
            }
        }
    }
}

