package HomeWork3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SaveToFile {


    public void save(Human human) throws IOException {
        if (human.getSurname() != null && human.getFirstName() != null && human.getLastName() != null && human.getBirthday() != null
                && human.getPhoneNumber() != null && human.getGender() != null){
        Path path = Paths.get(human.getSurname());
        String info = "<" + human.getSurname() + ">" + "<" + human.getFirstName() + ">"+ "<" + human.getLastName() + ">"
                + "<" + human.getBirthday() + ">" + "<" + human.getPhoneNumber() + ">" + "<" + human.getGender() + ">\n";
        if (Files.exists(path)){

            Files.write(path, info.getBytes(), StandardOpenOption.APPEND);

        } else {
            FileWriter writer = new FileWriter(human.getSurname());
            writer.write(info);
            writer.close();
        }


    }else {
            System.out.println("В записи в файл отказано по причине некорректно введенных данных");
    }
    }
}
