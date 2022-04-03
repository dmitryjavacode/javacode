import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    System.out.println(getPeriodFromBirthday(LocalDate.EPOCH));
  }

  private static String getPeriodFromBirthday(LocalDate birthday) {
    LocalDate now = LocalDate.now();
    Period period = Period.between(birthday, now);
    return (period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
  }

}
