package homework2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите дробное число, разделив целое от дробного с помощью символа '.': ");
        try (Scanner scan = new Scanner(System.in)) {
            String number = scan.nextLine();
            while (true) {
                try {
                    float result = Float.parseFloat(number);
                    System.out.print("Вы ввели число: " + result);
                    break;
                } catch (Exception e) {
                    System.out.println("Вы ввели для раздления целого от дробного ',' вместо '.'. Повторите ввод: ");

                } 

            }

        }

    }

}
