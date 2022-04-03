package ru.skillbox;

public class Main {
    public static void main(String[] args) {

        ArithmeticCalculator obj1 = new ArithmeticCalculator(8, 3);
        System.out.println("Результаты для чисел " + obj1.getNumberOne() + ", " + obj1.getNumberTwo());

        System.out.println(Operation.ADD.getOperationName() + ": " + obj1.calculate(Operation.ADD) + "\n" +
                Operation.SUBTRACT.getOperationName() + ": " + obj1.calculate(Operation.SUBTRACT) + "\n" +
                Operation.MULTIPLY.getOperationName() + ": " + obj1.calculate(Operation.MULTIPLY) + "\n");

        ArithmeticCalculator obj2 = new ArithmeticCalculator(17, 9);
        System.out.println("Результаты для чисел " + obj2.getNumberOne() + ", " + obj2.getNumberTwo());

        System.out.println(Operation.ADD.getOperationName() + ": " + obj2.calculate(Operation.ADD) + "\n" +
                Operation.SUBTRACT.getOperationName() + ": " + obj2.calculate(Operation.SUBTRACT) + "\n" +
                Operation.MULTIPLY.getOperationName() + ": " + obj2.calculate(Operation.MULTIPLY) + "\n");

        ArithmeticCalculator obj3 = new ArithmeticCalculator(23, 45);
        System.out.println("Результаты для чисел " + obj3.getNumberOne() + ", " + obj3.getNumberTwo());

        System.out.println(Operation.ADD.getOperationName() + ": " + obj3.calculate(Operation.ADD) + "\n" +
                Operation.SUBTRACT.getOperationName() + ": " + obj3.calculate(Operation.SUBTRACT) + "\n" +
                Operation.MULTIPLY.getOperationName() + ": " + obj3.calculate(Operation.MULTIPLY) + "\n");
    }
}
