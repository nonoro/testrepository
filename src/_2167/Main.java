package _2167;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int g = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int[][] array = new int[g][b];
        for (int i = 0; i < g; i++) {
            String[] element = scanner.nextLine().split(" ");
            for (int j = 0; j < b; j++) {
                array[i][j] = Integer.parseInt(element[j]);
            }
        }

        int k = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < k; i++) {
            String[] inputElement = scanner.nextLine().split(" ");
            int firstX = Integer.parseInt(inputElement[0]) - 1;
            int firstY = Integer.parseInt(inputElement[1]) - 1;
            int lastX = Integer.parseInt(inputElement[2]) - 1;
            int lastY = Integer.parseInt(inputElement[3]) - 1;

            int sum = 0;
            for (int x = firstX; x <= lastX; x++) {
                for (int y = firstY; y <= lastY; y++) {
                    sum += array[x][y];
                }
            }
            System.out.println(sum);
        }
    }
}
