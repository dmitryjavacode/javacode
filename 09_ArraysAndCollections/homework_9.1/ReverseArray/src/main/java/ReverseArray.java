public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse (String[] strings){
        for (int i = 0; i < strings.length / 2; i++) {
            String strBuffer = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = strBuffer;
        }
        return strings;
    }
}
