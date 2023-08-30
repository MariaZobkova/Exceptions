package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

//Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
//        Фамилия Имя Отчество датарождения номертелефона пол
//
//        Форматы данных:
//        фамилия, имя, отчество - строки
//        датарождения - строка формата dd.mm.yyyy
//        номертелефона - целое беззнаковое число без форматирования
//        пол - символ латиницей f или m.
//
//        Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
//
//        Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
//
//        Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
//
//<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
//
//Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//
//        Не забудьте закрыть соединение с файлом.
//
//        При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
public class Human {

    private String surname;
    private String firstName;
    private String lastName;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void humanData(){
        System.out.println("Введите следующие данные через пробел: Фамилия Имя Отчество дата рождения номер телефона пол");
        Scanner in = new Scanner(System.in);
        String str = (in.nextLine());
        String [] data = str.split(" ");

        if (data.length == 6){

            surname = data[0];
            firstName = data[1];
            lastName = data[2];
            String bd = data[3];
            String [] bday = bd.split("");
            if (bday[2].equals(".") && bday[5].equals("."))  {
                birthday = data[3];}
            else {
                System.out.println("Вы ввели некорректное значение даты рождения");

            }
            try {int pn = Integer.parseInt(data[4]);
                phoneNumber = data[4];
            } catch (NumberFormatException e){
                System.out.println("Вы ввели некорректное значение номера телефона");

            }
            if (data[5].equals("m") || data[5].equals("f")){
                gender = data[5];}
            else {
                System.out.println("Вы ввели некорректное значение пола");

            }
        }else{

        throw new IndexOutOfBoundsException("Вы ввели некорректное количество запрашиваемых данных");}

    }
}
