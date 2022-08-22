package _5597;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int max = 30;

        for (int i = 0; i < 28; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        for (int i = 1; i <= max; i++) {
            // TODO: 2022/08/22 contain으로 풀어보기
            if (!list.contains(i)) {
                result.add(i);
            }
        }

        Collections.sort(result);
        System.out.println(result.get(0));
        System.out.println(result.get(1));

    }
}
