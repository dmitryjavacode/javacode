public class Main {

    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] reverseColors = ReverseArray.reverse(line.split(",?\\s+"));
        for (String color : reverseColors) {
            System.out.println(color);
        }
    }
}
