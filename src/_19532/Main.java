package _19532;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);
        List<Integer> list = new ArrayList<>();

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if ((a * i) + (b * j) == c) {
                    if ((d * i) + (e * j) == f)  {
                        list.add(i);
                        list.add(j);
                    }
                }
            }
        }
//        Collections.sort(list);
        System.out.println(list.get(0) + " " + list.get(1));
    }
}
