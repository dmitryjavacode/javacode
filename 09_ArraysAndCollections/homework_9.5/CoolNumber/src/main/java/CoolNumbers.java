import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        // Создаем массив с необходимым набором букв
        ArrayList<String> coolNumbers = new ArrayList<>();
//        String letters = "ABEKMHOPCTYX"; //eng letters
        String letters = "АВЕКМНОРСТУХ";
        String[] letterArray = new String[letters.length()];
        int count = 0;
        for (int i = 0; i < 1200; i++) {
            char ch = (char) i;
            if (letters.contains(String.valueOf(ch))) {
                letterArray[count] = String.valueOf(ch);
                count++;
            }
        }
        // Генерируем номера
        int randNumber;
        int randRegion;
        for (int i = 0; i < 4000000; i++) {
            randRegion = (int) (Math.random() * (199 - 1) + 1); // от 1 до 199
            randNumber = (int) (Math.random() * (10 - 1) + 1); // от 0 до 9, так как номера 000 не может быть.
            String coolNumber = (letterArray[(int) (Math.random() * letterArray.length)] +
                    randNumber +
                    randNumber +
                    randNumber +
                    letterArray[(int) (Math.random() * letterArray.length)] +
                    letterArray[(int) (Math.random() * letterArray.length)] +
                    // Добавляем 0, если номер региона длинной 1 символ.
                    (String.valueOf(randNumber).length() == 1 ? String.format("%02d", randRegion) : randRegion));
            coolNumbers.add(coolNumber);
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
