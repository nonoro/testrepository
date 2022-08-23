package _21918;

import java.util.Scanner;

public class Main {
    static boolean[] light;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");

        int N = Integer.valueOf(input1[0]);
        int M = Integer.valueOf(input1[1]);

        light = new boolean[N + 1];

        String[] lightStatus = sc.nextLine().split(" ");

        for (int i = 1; i <= N; i++) {
            light[i] = !lightStatus[i - 1].equals("0");
        }

        for (int i = 0; i < M; i++) {
            String[] option = sc.nextLine().split(" ");

            int a = Integer.valueOf(option[0]);
            int b = Integer.valueOf(option[1]);
            int c = Integer.valueOf(option[2]);

            switch (a) {
                case 1:
                    selectLightOnOff(b, c);
                    break;
                case 2:
                    fromToLightOnOff(b, c);
                    break;
                case 3:
                    fromToLightOff(b, c);
                    break;
                case 4:
                    fromToLightOn(b, c);
                    break;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(light[i] ? 1 : 0);
            System.out.print(" ");

        }





    }


    private static void selectLightOnOff(int b, int c) {
        light[b] = c != 0;
    }


    private static void fromToLightOnOff(int b, int c) {
        for (int i = b; i <= c; i++) {
            light[i] = !light[i];
        }
    }

    private static void fromToLightOff(int b, int c) {
        for (int i = b; i <= c; i++) {
            light[i] = false;
        }
    }

    private static void fromToLightOn(int b, int c) {
        for (int i = b; i <= c; i++) {
            light[i] = true;
        }
    }

}

