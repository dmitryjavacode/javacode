public class HumanitarianDelivery {
    private final int truckCapacity = 12;
    private final int containerCapacity = 27;
    private int box;
    private int countTruck = 1;
    private int countContainer = 1;

    public HumanitarianDelivery (String boxes) {
        this.box = Integer.parseInt(boxes);
    }

    public void DispatchOfCargo () {
        int container = box / containerCapacity + ((box % containerCapacity) != 0 ? 1 : 0); // кол-во контейнеров
        int truck = container / truckCapacity + ((container % truckCapacity) != 0 ? 1 : 0); // кол-во грузовиков

        for (int i = 1; i <= box; i++) {
            if ((i - 1)  % (truckCapacity * containerCapacity) == 0 || i == 1) {
                System.out.println("Грузовик: " + countTruck);
                countTruck++;
            }

            if ((i - 1) % containerCapacity == 0 || i == 1) {
                System.out.println("\tКонтейнер: " + countContainer);
                countContainer++;
            }

            System.out.println("\t\tЯщик: " + i);
        }

        System.out.println("Необходимо:" + "\r\n" +
                "грузовиков - " + truck + " шт.\r\n" +
                "контейнеров - " + container + " шт.");
    }
}
