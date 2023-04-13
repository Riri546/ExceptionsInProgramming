import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner s = new Scanner(System.in);
        System.out.print("> ");
        int a = s.nextInt();
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(arrayN(array, a));
        s.close();
    }

    private static int arrayN(int[] array, int n) {
        if (array == null)
            return -3;
        if (array.length == 0)
            return -4;
        if (array.length < 3)
            return -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -2;
    }
}
