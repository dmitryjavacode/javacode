package ru.skillbox;

public enum Operation {
    ADD("Сложение"), SUBTRACT("Вычитание"), MULTIPLY("Умножение");

    private String operationName;

    Operation(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationName() {
        return operationName;
    }
}
