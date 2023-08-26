package HomeWork2;

import java.util.Scanner;

public class Task4 {
//    Разработайте программу, которая выбросит Exception,
//    когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static void main(String[] args) {
        System.out.println(emptyString());

    }

    public static String emptyString (){
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String str = (in.nextLine());
        if (str.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя!");
            }

        return str;
    }
}

