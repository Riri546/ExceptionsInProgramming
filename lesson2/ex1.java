package lesson2;

import java.util.Scanner;

public class ex1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = -1;
            try {
                index = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Здесь должно быть число от 0 до 9!");
            }
            try {
                arr[index] = 1;
            } catch (Exception e) {
                System.out.println("Указан индекс за пределами массива");
            }
        }
    }
}
