public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(totalEarnings(text));

    //TODO: напишите ваш код, результат вывести в консоль
  }

  public static String totalEarnings(String text) {
    String searchText = "рубл";
    String salary = "";
    int sum = 0;
    int i = text.lastIndexOf(searchText) - 2;
    while (Character.isDigit(text.charAt(i))) {
      salary = text.charAt(i) + salary;
      i--;
    }
    sum += Integer.parseInt(salary);
    salary = "";
    i = text.indexOf(searchText) - 2;
    while (Character.isDigit(text.charAt(i))) {
      salary = text.charAt(i) + salary;
      i--;
    }
    sum += Integer.parseInt(salary);
    salary = "";
    i = text.indexOf(searchText, text.indexOf(searchText) + 1) - 2;
    while (Character.isDigit(text.charAt(i))) {
      salary = text.charAt(i) + salary;
      i--;
    }
    sum += Integer.parseInt(salary);

    return String.valueOf(sum);
  }

}