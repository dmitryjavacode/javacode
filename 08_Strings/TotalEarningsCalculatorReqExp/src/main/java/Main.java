import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

  }

  public static int calculateSalarySum(String text){
    //TODO: реализуйте метод
    String regex = "[0-9]{1,9}";
    int result = 0;
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      result += Integer.parseInt(text.substring(start, end));
    }

    return result;
  }

}