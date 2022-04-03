import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

//    String text = "Иванов Иван Иванович";
//    char symbol = text.charAt(2);
//    System.out.println(Character.isDigit(text.charAt(2)));

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
    int spaceCount = 0;
    for (int i = 0; i < text.trim().length(); i++) {
      char symbol = text.charAt(i);
      if (Character.isDigit(symbol)) {
        spaceCount = -1;
        break;
      }
      if (symbol == ' ') {
        spaceCount++;
      }
    }
    return spaceCount == 2;
  }

}