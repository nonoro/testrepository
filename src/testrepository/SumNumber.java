package testrepository;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        String countNumber = scanner.nextLine();
        String input = scanner.nextLine();
        String[] numbers = input.split("");
        for (int i = 0; i < numbers.length; i++) {
            Integer number = Integer.parseInt(numbers[i]);
            result += number;
        }
        System.out.println(result);
    }
}
