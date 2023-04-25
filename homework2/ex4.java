package homework2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) {
        try {
            String[] strings = { "apple", "orange" };
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            System.out.println(strings1);
            System.out.println(a);
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
