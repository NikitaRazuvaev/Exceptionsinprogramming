package Result;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

class GenderException extends Exception {
    private char gender;

public GenderException(String message, char gender) {
    super(message);
    this.gender = gender;
}

public char getGender() {
    return gender;
}
}

class ParseException extends Exception {
    private int position;

public ParseException(String message, int position) {
    super(message);
    this.position = position;
}

public int getPosition() {
    return position;
}
}


public class main {
    public static void main(String[] args) {
        try {
        String input = "Иванов Иван Иванович 01.12.2000 1234567890 m";
        String[] values = input.split(" ");

        // Проверка количества данных
        if (values.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных");
        }

        // Разбор фамилии, имени и отчества
        String surname = values[0];
        String name = values[1];
        String patronymic = values[2];

        // Разбор даты рождения
        String[] dateParts = values[3].split("\\.");
        if (dateParts.length != 3) {
            throw new ParseException("Неверный формат даты рождения", 3);
        }
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        LocalDate birthDate = LocalDate.of(year, month, day);

        // Разбор номера телефона
        long phoneNumber = Long.parseLong(values[4]);

        // Разбор пола
        char gender = values[5].charAt(0);
        if (gender != 'm' && gender != 'f') {
            throw new GenderException("Неверное значение пола", gender);
        }

        // Запись данных в файл
        BufferedWriter writer = new BufferedWriter(new FileWriter(surname + ".txt", true));
        writer.write(surname + name + patronymic + birthDate.toString() + " " + phoneNumber + " " + gender);
        writer.newLine();
        writer.close();
    } catch (NumberFormatException e) {
        System.out.println("Неверный формат номера телефона");
        e.printStackTrace();
    } catch (ParseException e) {
        System.out.println("Неверный формат даты рождения");
        e.printStackTrace();
    } catch (GenderException e) {
        System.out.println("Неверное значение пола");
        e.printStackTrace();
    } catch (IllegalArgumentException e) {
        System.out.println("Неверное количество данных");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Ошибка при записи в файл");
        e.printStackTrace();
    }
    }
}
