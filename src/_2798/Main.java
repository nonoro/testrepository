package _2798;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String[] a = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(s[0]); i++) {
            for (int j = i + 1; j < Integer.parseInt(s[0]); j++) {
                for (int k = j + 1; k < Integer.parseInt(s[0]); k++) {

                list.add(Integer.parseInt(a[i]) + Integer.parseInt(a[j]) + Integer.parseInt(a[k]));
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= Integer.parseInt(s[1])) {
                list2.add(list.get(i));
            }
        }
        System.out.println(Collections.max(list2));
    }
}
