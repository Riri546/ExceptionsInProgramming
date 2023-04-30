package lesson3;

import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() throws IOException {

    }
}
