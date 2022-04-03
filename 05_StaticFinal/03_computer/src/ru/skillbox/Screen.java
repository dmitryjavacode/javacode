package ru.skillbox;

public class Screen {
    private final int screenDiagonal;
    private final ScreenType screenType;
    private final int weight;

    public Screen(int screenDiagonal, ScreenType screenType, int weight) {
        this.screenDiagonal = screenDiagonal;
        this.screenType = screenType;
        this.weight = weight;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public int getWeight() {
        return weight;
    }
}
