import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Scanner use = new Scanner(System.in);
        System.out.print("> ");
        int number = use.nextInt();
        int[] array = { 1, 2, 3, 4, 5 };
        int result = arrayN(array, number);

        switch (result) {
            case -3 -> System.out.println("Массив не может быть null");
            case -4 -> System.out.println("Длина массива равна нулю");
            case -1 -> System.out.println("Массив меньше заданной длины");
            case -2 -> System.out.println("% d Элемент не найден" + number);
            default -> System.out.printf("%d Имеет инлекс %b", number, result);
        }

        System.out.println(arrayN(array, number));
        use.close();
    }

    private static int arrayN(int[] array, int n) {
        if (array == null) {
            return -3;
        }
        if (array.length == 0) {
            return -4;
        }
        if (array.length < 3) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -2;
    }
}
