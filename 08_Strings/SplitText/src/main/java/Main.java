public class Main {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String result = "";
    String regex = "[\\s]+";
    String textBuff = text.replaceAll("[^A-z\\s’]"," ");
    String[] engWords = textBuff.split(regex);
    for (int i = 0; i < engWords.length; i++) {
      result += engWords[i] + (i != textBuff.length() ? System.lineSeparator() : "");
    }

    return result.trim();
  }

}