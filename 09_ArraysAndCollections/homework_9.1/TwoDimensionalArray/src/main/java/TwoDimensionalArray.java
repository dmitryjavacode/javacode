public class  TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char symbol = 'X';
        char[][] result = new char[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (i == j || size - 1 - i == j) {
                    result[i][j] = symbol;
                } else {
                    result[i][j] = ' ';
                }
            }
        }

        return result;
    }
}
