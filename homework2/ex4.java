package homework2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int res;
        String strings1;

        try {
            String[] strings = { "apple", "orange" };
            strings1 = strings[1];
            test();
            res = a/b;
            System.out.println(res);
        } catch (ArithmeticException e) {
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
