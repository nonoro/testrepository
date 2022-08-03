package _22864;

import java.util.Scanner;

public class Main {

    private static final int number = 24;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");


        int A = Integer.parseInt(s[0]); // 피로도
        int B = Integer.parseInt(s[1]); // 시간당 처리할 수 있는 일의양
        int C = Integer.parseInt(s[2]); // 피로도감소
        int D = Integer.parseInt(s[3]); // 최대 피로도
        int sum = 0;
        int workingNumber = 0;


        for (int i = 0; i < 24; i++) {
            if ((sum + A) > D) {
                sum -= C;
                if (sum < 0) {
                    sum = 0;
                }
                continue;
            }

            workingNumber++;
            sum += A;
        }

        System.out.println(workingNumber * B);

    }
}
