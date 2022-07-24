package _9046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 26개의 크기를 가진 배열을 만들고, 입력한 값을 하나씩 분석해서 각 배열의 자리에 +1 을 해준다
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < k; i++) {
            int[] array = new int[26];
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char[] chars = input.toCharArray();
                if ('a' <= chars[j] && chars[j] <= 'z') {
                    array[chars[j] - 'a'] += 1;
                }
            }
//            for (int x = 0; x < 26; x++) {
//                System.out.print(array[x] + "\t");
//            }
//
//            System.out.println();
            // 2. 배열의 자리중 가장 큰 값을 가진 곳을 찾아서 저장한다

            int max = 0;
            for (int x = 0; x < array.length; x++) {
                if (max < array[x]) {
                    max = array[x];
                }
            }
//            System.out.println(max);

            // 3. 배열이 가진 값중 가장 큰 값을 가진 배열이 1개면 그것을 그대로 출력하고 아니면 물음표를 출력한다
            int count = 0;
            int abc = 0;
            for (int y = 0; y < 26; y++) {
                if (max == array[y]) {
                    count++;
                    abc = y;
                }
            }
            System.out.println(count == 1 ? (char) (abc + 'a') : "?");
        }
    }
}



