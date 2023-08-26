package HomeWork2;

import java.util.Scanner;



public class Task1 {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    //Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Введите число: ");
                System.out.println(userNumber());
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Вы ввели не число");
            }


        }
    }

    public static float userNumber() throws NumberFormatException {

        Scanner in = new Scanner(System.in);
        float number = Float.parseFloat(in.nextLine());
        return number;
    }

}




