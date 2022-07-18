package testrepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warning {
    public static void main(String[] args) {
        int hour1 = 0;
        int hour2 = 0;
        int hour = 0;
        int minutue1 = 0;
        int minutue2 = 0;
        int minutue = 0;
        int second1 = 0;
        int second2 = 0;
        int second = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 시간을 입력하세요 > ");
        String strings1 = scanner.nextLine();
        String[] split1 = strings1.split(":");
        System.out.print("두번째 시간을 입력하세요 > ");
        String strings2 = scanner.nextLine();
        String[] split2 = strings2.split(":");

        List<Integer> list = new ArrayList<>();
        hour1 = Integer.parseInt(split1[0]);
        hour2 = Integer.parseInt(split2[0]);
        minutue1 = Integer.parseInt(split1[1]);
        minutue2 = Integer.parseInt(split2[1]);
        second1 = Integer.parseInt(split1[2]);
        second2 = Integer.parseInt(split2[2]);



        if (hour1 == hour2 && minutue1 == minutue2 && second1 == second2) {
            hour = 24;
            minutue = 0;
            second = 0;
        }
        if (second1 > second2) {
            second = 60 - second1 + second2;
            minutue -= 1;
        } else if (second2 > second1) {
            second = second2 - second1;
        }

        if (minutue1 > minutue2) {
            minutue += 60 - minutue1 + minutue2;
            hour -= 1;
        } else if (minutue2 > minutue1) {
            minutue += minutue2 - minutue1 ;
        }

        if (hour1 > hour2) {
            hour += 24 - hour1 + hour2;
        } else if (hour2 > hour1) {
            hour += hour2 - hour1;
        }

        list.add(hour);
        list.add(minutue);
        list.add(second);
        System.out.printf(String.format("%02d:%02d:%02d", list.get(0), list.get(1), list.get(2)));
    }
}

