package lesson2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = -1;

            while (true) {
                try {
                    index = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Здесь должно быть число от 0 до 9!");
                    scanner.next();
                }
            }
            try {
                arr[index] = 1;
            } catch (Exception e) {
                System.out.println("Указан индекс за пределами массива");
            }
        } 
    }
}
