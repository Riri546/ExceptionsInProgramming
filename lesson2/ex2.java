package lesson2;

public class ex2 {
    public static void main(String[] args) {
        int sum = sum2d(new String[][] { { "1", "2", "3", "4", "j", "6" }, { "1", "w" }, { "2", "7" } });
        System.out.println(sum);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                // for (int j = 0; j < arr[i].length; j++){

                for (int j = 0; j <= 5; j++) {
                    int val = 0;
                    try {
                        val = Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    sum += val;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Неизвестная ошибка");
        }
        return sum;
    }
}
