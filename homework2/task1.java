/*
 * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных
 */
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
                    // e.printStackTrace();
                    System.out.print("Здесь должно быть дробное число, введенное через симавол '.'. Повторите ввод : ");
                    scan.next();
                }

            }

        }
    }
}
