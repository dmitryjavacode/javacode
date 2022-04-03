package ru.skillbox;

public class ArithmeticCalculator {
    private int numberOne;
    private int numberTwo;


    public ArithmeticCalculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }


         // Вариант №1 c int
    public int calculate(Operation type) {
         switch (type) {
            case ADD:
                return addNumber();
            case SUBTRACT:
                return subtractNumber();
            case MULTIPLY:
                return multiplyNumber();
            default:
                return 0;
        }
    }

        // Вариант №2 со String
//    public String calculate(Operation type) {
//        switch (type) {
//            case ADD:
//                return type.getOperationName() + ": " + numberOne + " + " + numberTwo + " = " + addNumber();
//            case SUBTRACT:
//                return type.getOperationName() + ": " + numberOne + " - " + numberTwo + " = " + subtractNumber();
//            case MULTIPLY:
//                return type.getOperationName() + ": " + numberOne + " * " + numberTwo + " = " + multiplyNumber();
//            default:
//                return "Ошибка. Операция не найдена.";
//        }
//    }

    private int addNumber() {
        return numberOne + numberTwo;
    }

    private int subtractNumber() {
        return numberOne - numberTwo;
    }

    private int multiplyNumber() {
        return numberOne * numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
}
