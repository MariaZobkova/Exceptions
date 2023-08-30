package HomeWork3;

import java.io.IOException;

//Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
public class Main {
    public static void main(String[] args) {
        Human Andrey = new Human();
        Andrey.humanData();
        try{ SaveToFile saveToFile = new SaveToFile();
        saveToFile.save(Andrey);}
        catch (IOException e){
            e.printStackTrace();
        }
//        Human Andr = new Human();
//        Andr.humanData();
//        saveToFile.save(Andr);

    }
}
