package lesson1;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 3;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            // Показ того, что идет не так и продолжение исполнение
            e.printStackTrace();
        } catch (Exception e) {
            // Исключение
            throw new RuntimeException();
        }
    }
}