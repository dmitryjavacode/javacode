import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      System.out.println(nameFormat(input));
      //TODO:напишите ваш код тут, результат вывести в консоль.
      //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
    }
  }

  public static String nameFormat(String text) {
    String result;
    int index = text.indexOf(' ');
    if (checkName(text)) {
      String template = "Фамилия: %s%nИмя: %s%nОтчество: %s";
      result = String.format(template, text.substring(0, index),
              text.substring(index, text.indexOf(' ', index + 1)).trim(),
              text.substring(text.indexOf(' ', index + 1)).trim());
    } else {
      result = "Введенная строка не является ФИО";
    }
    return result;
  }

  public static boolean checkName(String text) {
    String regex = "^[а-яА-Я\\-&&[^0-9]]{0,15}[\\s]{1}[а-яА-Я\\-&&[^0-9]]{0,15}[\\s]{1}[а-яА-Я\\-&&[^0-9]]{0,15}$";
    return text.matches(regex);
  }
}