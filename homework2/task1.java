package homework2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("введите дробное число");
        try (Scanner scan = new Scanner(System.in)) {
            float num = scan.nextFloat();
            System.out.println("Вы ввели число: " + num);
        }

    }

}
