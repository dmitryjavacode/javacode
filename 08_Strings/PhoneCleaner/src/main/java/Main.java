import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      System.out.println(phoneCleaner(input));
      //TODO:напишите ваш код тут, результат вывести в консоль.
    }
  }

  public static String phoneCleaner(String input) {
    String regexReplace = "[^0-9]";
    String phone = input.replaceAll(regexReplace, "");
    String result;
    if (phone.matches("[7][0-9]{10}")) {
      result = phone;
    } else if (phone.matches("[8][0-9]{10}")) {
      result = phone.replaceFirst("8", "7");
    } else if (phone.matches("[0-9]{10}")) {
      result = "7".concat(phone);
    } else {
      result = "Неверный формат номера";
    }
    return result;
  }

}
