package homework2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите дробное число, разделив целое от дробного с помощью символа '.' : ");
        try (Scanner scan = new Scanner(System.in)) {
            String number = scan.nextLine();
            float result;
            while (true) {
                try {
                    result = Float.parseFloat(number);
                    System.out.print("Вы ввели число: " + result);
                    break;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.print("Здесь должно быть дробное число, введенное через симавол '.'. Повторите ввод : ");
                    scan.next();
                }
            }
        }
    }
}
