package _18312;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int count = 0;

        for (int hour = 0; hour <= n; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                        if (hour % 10 == k || hour / 10 == k ||
                            minute % 10 == k || minute / 10 == k ||
                            second % 10 == k || second / 10 == k) {
                            count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
