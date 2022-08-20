package _1212;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("0")) {
            System.out.println(0);
            return;
        }

        // 숫자 하나씩 빼서 2진수로 만듬 그 다음 StringBuilder 에 넣는다
        // 하나를 빼서 넣는 이유는 맨처음 나오는 숫자가 0이 아니여야 되기 때문이다
        // 그리고 나머지 뒤에 두개는 2진수로 바꿔서 3자리씩 뽑기위해서 %03으로 3자리를 맞추고
        // 빈자리는 0으로 채우기위해서 String.format() 으로 포맷을 정해준다
        // 근데 처음에 하나넣고 나머지 2개는 3자리씩 나오게 해서 넣는다
        String[] split = input.split("");
        StringBuilder result = new StringBuilder();

        result.append(Integer.toBinaryString(Integer.valueOf(split[0])));
        for (int i = 1; i < split.length; i++) {
            String lastResult = Integer.toBinaryString(Integer.valueOf(split[i]));
            result.append(String.format("%03d", Integer.parseInt(lastResult)));
        }

        System.out.println(result);
    }
}
