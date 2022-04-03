package ru.skillbox;

public class CargoDelivery {
    private final Dimensions volume;
    private final String name;
    private final int weightCargo;
    private final String addressDelivery;
    private final boolean turnCargo;
    private final boolean fragileCargo;
    private final String registrationNumber;

    public CargoDelivery(int height,
                         int widht,
                         int lenght,
                         String name,
                         int weightCargo,
                         String addressDelivery,
                         boolean turnCargo,
                         boolean fragileCargo,
                         String registrationNumber) {
        this.volume = new Dimensions(height, widht, lenght);
        this.name = name;
        this.weightCargo = weightCargo;
        this.addressDelivery = addressDelivery;
        this.turnCargo = turnCargo;
        this.fragileCargo = fragileCargo;
        this.registrationNumber = registrationNumber;
    }

    public CargoDelivery setAddress(String addressDelivery) {
        return new CargoDelivery(volume.getHeight(), volume.getWidth(), volume.getLenght(), name, weightCargo, addressDelivery, turnCargo, fragileCargo, registrationNumber);
    }

    public CargoDelivery setVolume(int height, int widht, int lenght) {
        return new CargoDelivery(height, widht, lenght, name, weightCargo, addressDelivery, turnCargo, fragileCargo, registrationNumber);
    }

    public CargoDelivery setWeightCargo(int weightCargo) {
        return new CargoDelivery(volume.getHeight(), volume.getWidth(), volume.getLenght(), name, weightCargo, addressDelivery, turnCargo, fragileCargo, registrationNumber);
    }

    public Dimensions getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public int getWeightCargo() {
        return weightCargo;
    }

    public String getAddress() {
        return addressDelivery;
    }

    public boolean isTurnCargo() {
        return turnCargo;
    }

    public boolean isFragileCargo() {
        return fragileCargo;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    private String canTurnCargo(boolean turnCargo) {
        return turnCargo ? "Да" : "Нет";
    }

    private String canFragileCargo(boolean fragileCargo) {
        return fragileCargo ? "Да" : "Нет";
    }


    public String toString(){
        return
                "Габариты(В х Ш х Д): " + volume.getHeight() + " " + volume.getWidth() + " " + volume.getLenght() + "\n" +
                "Обьем(Вариант №1): " + volume.volumeCargo(
                        volume.getHeight(),
                        volume.getWidth(),
                        volume.getLenght()) + "\n" +
                "Обьем(Вариант №2): " + getVolume() + "\n" +
                "Наименование товара: "+ name + "\n" +
                "Вес товара: " + weightCargo + "\n"+
                "Адрес доставки: " + addressDelivery + "\n" +
                "Можно переворачивать? " + canTurnCargo(turnCargo) + "\n" +
                "Хрупкий груз? " + canFragileCargo(fragileCargo) + "\n" +
                "Регистрационный номер: " + registrationNumber;
    }
}
