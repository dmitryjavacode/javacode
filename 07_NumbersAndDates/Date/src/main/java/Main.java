import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int day = 12;
        int month = 9;
        int year = 2020;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E").localizedBy(new Locale("EN"));

        String birthDays = "";
        int i = 0;
        while (birthday.plusYears(i).isBefore(today) || birthday.plusYears(i).isEqual(today)) {
            birthDays += (i + " - " + birthday.plusYears(i).format(formatter) + System.lineSeparator());
            i++;
        }

        return birthDays;
    }
}
