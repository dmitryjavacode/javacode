package ru.skillbox;

public class Computer  {
    private String name;
    private String vendor;
    private Cpu cpu;
    private Ram ram;
    private DataStorageDevice dataStorageDevice;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String name, String vendor, Cpu cpu, Ram ram, DataStorageDevice dataStorageDevice, Screen screen, Keyboard keyboard) {
        this.name = name;
        this.vendor = vendor;
        this.cpu = cpu;
        this.ram = ram;
        this.dataStorageDevice = dataStorageDevice;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setDataStorageDevice(DataStorageDevice dataStorageDevice) {
        this.dataStorageDevice = dataStorageDevice;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int totalWeight() {
        return cpu.getWeight() +
                ram.getWeight() +
                dataStorageDevice.getWeight() +
                screen.getWeight() +
                keyboard.getWeight();
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public DataStorageDevice getDataStorageDevice() {
        return dataStorageDevice;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }



    public String toString() {
        return  "Производитель: " + vendor + "\n" +
                "Модель: " + name + "\n" +
                "Вес: " + totalWeight() + " гр." + "\n\n" +
                "----------------------Характеристики----------------------" + "\n" +
                "Процессор" + "\n" +
                "Производитель: " + cpu.getManufacturer() + "\n" +
                "Кол-во ядер: " + cpu.getCoresNumber() + "\n" +
                "Тактовая частота: " + cpu.getCpuFrequency() + " Mhz" + "\n" +
                "----------------------------------------------------------" + "\n" +
                "Оперативная память" + "\n" +
                "Тип: " + ram.getRamType() + "\n" +
                "Обьем: " + ram.getMemorySize() + " Gb" + "\n" +
                "----------------------------------------------------------" + "\n" +
                "Накопитель" + "\n" +
                "Тип: " + dataStorageDevice.getType() + "\n" +
                "Обьем: " + dataStorageDevice.getMemorySize() + " Gb" + "\n" +
                "----------------------------------------------------------" + "\n" +
                "Монитор " + "\n" +
                "Диагональ: " + screen.getScreenDiagonal() + " дюймов" + "\n" +
                "Тип матрицы: " + screen.getScreenType() + "\n" +
                "----------------------------------------------------------" + "\n" +
                "Клавиатура " + "\n" +
                "Тип: " + keyboard.getKeyboardType() + "\n" +
                "Наличие подсветки: " + (keyboard.isKeyboardLight() ? "Есть" : "Нет") + "\n" +
                "----------------------------------------------------------" + "\n\n";
    }
}
