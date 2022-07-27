package _10798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] strings = new String[5][15];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String[] split = sc.nextLine().split("");
            for (int j = 0; j < split.length; j++) {
                strings[i][j] = split[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (strings[j][i] != null) {
                    System.out.print(strings[j][i]);
                }
            }
        }
    }
}
