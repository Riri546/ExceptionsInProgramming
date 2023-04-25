package homework2;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[8];
        try {
            int d = 0;
            double catchedRes1 = array[0] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            System.out.println("Нельзя делить на ноль");
        }
    }
}
