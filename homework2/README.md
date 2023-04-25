# Задание 1
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

# Задание 2
Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

# Задание 3
Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

# Задание 4
Исправьте код, примените подходящие способы обработки исключений:

``` java
public static void main(String[] args) {
        InputStream inputStream;
        try {
                String[] strings = {"apple", "orange"};
                String strings1 = strings[2];
                test();
                int a = 1 / 0;
                inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("На ноль делить нельзя");
        }
        catch (Throwable e) {
                e.printStackTrace();
        } catch (StackOverflowError error) {
                System.out.println("Что-то сломалось");
        } finally {
                System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
}

private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
}
 ```