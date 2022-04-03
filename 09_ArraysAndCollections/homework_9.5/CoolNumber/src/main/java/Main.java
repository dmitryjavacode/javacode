import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>(CoolNumbers.generateCoolNumbers());
        ArrayList<String> sortNumbers = numbers;
        Collections.sort(sortNumbers);
        HashSet<String> setHashNumbers = new HashSet<>(numbers);
        TreeSet<String> setTreeNumbers = new TreeSet<>(numbers);

        String result;
        String numberSearch = "Х222УС06";

        //Поиск перебором
        long firstStart = System.nanoTime();
        if (CoolNumbers.bruteForceSearchInList(numbers, numberSearch)) {
            result = "найден";
        } else {
            result = "не найден";
        }
        long firstEnd = System.nanoTime() - firstStart;
        System.out.println("Поиск перебором: номер " + result + ", поиск занял " + firstEnd + "нс");

        // Бинарный поиск
        long secondStart = System.nanoTime();
        if (CoolNumbers.binarySearchInList(sortNumbers, numberSearch)) {
            result = "найден";
        } else {
            result = "не найден";
        }
        long secondEnd = System.nanoTime() - secondStart;
        System.out.println("Поиск перебором: номер " + result + ", поиск занял " + secondEnd + "нс");

        // Поиск в HashSet
        long thirdStart = System.nanoTime();
        if (CoolNumbers.searchInHashSet(setHashNumbers, numberSearch)) {
            result = "найден";
        } else {
            result = "не найден";
        }
        long thirdEnd = System.nanoTime() - thirdStart;
        System.out.println("Поиск перебором: номер " + result + ", поиск занял " + thirdEnd + "нс");

        // Поиск в TreeSet
        long fourthStart = System.nanoTime();
        if (CoolNumbers.searchInTreeSet(setTreeNumbers, numberSearch)) {
            result = "найден";
        } else {
            result = "не найден";
        }
        long fourthEnd = System.nanoTime() - fourthStart;
        System.out.println("Поиск перебором: номер " + result + ", поиск занял " + fourthEnd + "нс");
    }
}
