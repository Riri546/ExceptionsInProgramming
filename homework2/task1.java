package homework2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("введите дробное число: ");
        try (Scanner scan = new Scanner(System.in)) {
            String number = scan.nextLine();
            try (){
                float result = Float.parseFloat(number);
            System.out.print("Вы ввели число: " + result);
            }
            

        }

    }

}
