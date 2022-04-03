package ru.skillbox;

public class Main {
    public static void main(String[] args) {
        CargoDelivery cargoOne = new CargoDelivery(20,
                30,
                40,
                "Товар 1",
                200,
                "Ул.Строителей, 25",
                true,
                true,
                "РЕГ057492");
        System.out.println(cargoOne);
        System.out.println();


        CargoDelivery cargoTwo = new CargoDelivery(20,
                30,
                40,
                "Товар 2",
                450,
                "Ул.Карла Маркса, 4",
                false,
                true,
                "РЕГ043958");
        System.out.println(cargoTwo);

        CargoDelivery cargoTwoCopy = cargoTwo.setVolume(50,50,50);
        System.out.println();

        System.out.println(cargoTwoCopy);


    }
}
