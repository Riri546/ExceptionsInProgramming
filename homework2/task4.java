package homework2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) {
        int a = 0;
        String strings1;

        try {
            String[] strings = { "apple", "orange" };
            strings1 = strings[1];
            test();
            a = 1 / 0;
        } catch (ArithmeticException e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (StackOverflowError error) {
            System.out.println("Что-то сломалось");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        try (FileReader reader = new FileReader(file)) {
            reader.read();
        }
        test();
    }
}
