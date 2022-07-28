package _10870;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;
        list.add(0);
        list.add(1);
        list.add(list.get(0) + list.get(1));

        for (int i = 1; i <= Integer.parseInt(input); i++) {
            sum = list.get(i) + list.get(i+1);
            list.add(sum);
        }

        System.out.println(list.get(Integer.parseInt(input)));
    }
}
