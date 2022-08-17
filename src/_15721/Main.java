package _15721;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personNumber = sc.nextInt();
        int T = sc.nextInt();
        int zeroOrone = sc.nextInt();
        int count = 0;
        int number = 0;
        int result = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                list.add(0);
                list.add(1);
                list.add(0);
                list.add(1);
                count++;
                for (int k = 0; k <= count; k++) {
                    list.add(0);
                }
                for (int k = 0; k <= count; k++) {
                    list.add(1);
                }
            }
        }

        for (int i = 0; i < personNumber * T; i++) {
            if (list.get(i) == zeroOrone) {
                number++;
                if (number == T) {
                    result = i;
                }
            }
        }
        System.out.println(result % personNumber);
    }
}
