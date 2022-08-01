package _2839;

import java.util.Scanner;

public class Main {
    static int[] arr = new int[9999];
    private static final int INF = 99999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i < arr.length; i++) {
            arr[i] = INF;
        }

        arr[3] = 1;

        int arrLength = arr.length;
        for (int i = 5; i < arrLength; i++) {
            arr[i] = Math.min(arr[i - 3] + 1, arr[i - 5] + 1);
        }

        System.out.println(arr[input] >= INF ? -1 : arr[input]);
    }
}
