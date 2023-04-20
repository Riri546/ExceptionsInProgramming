package lesson2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = 0;
            boolean count = true;
            // while (count) {
            // try {
            // index = scanner.nextInt();
            // break;
            // } catch (Exception e) {
            // System.out.println("Вы ввели не цифру! Повторите ввод (цифры от 0 до 9)");
            // }
            // }
            for (;;) {
                try {
                    index = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Вы ввели не цифру! Повторите ввод (цифры от 0 до 9)");
                }
            }
            try {
                arr[index] = 1;
            } catch (Exception e) {
                System.out.println("Указан индекс за пределам массива");
            }
        }
    }
}
