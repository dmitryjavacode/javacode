package ru.skillbox;

public class Main {
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu(3600, 8, "Intel", 50);
        Ram ram1 = new Ram(RamType.DDR4, 16, 20);
        DataStorageDevice storage1 = new DataStorageDevice(DataStorageType.SSD, 512, 20);
        Screen screen1 = new Screen(27, ScreenType.IPS, 1200);
        Keyboard keyboard1 = new Keyboard(KeyboardType.GAMING, true, 310);

        Computer compOne = new Computer("Republic of Gamers", "ASUS", cpu1, ram1, storage1, screen1, keyboard1);
        System.out.println(compOne);

        Cpu cpu2 = new Cpu(4000, 16, "AMD", 80);
        Ram ram2 = new Ram(RamType.DDR4, 32, 20);
        compOne.setCpu(cpu2);
        compOne.setRam(ram2);
        System.out.println(compOne);

    }
}
