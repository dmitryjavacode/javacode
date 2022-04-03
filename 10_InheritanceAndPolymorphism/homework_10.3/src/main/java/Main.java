public class Main {
    public static void main(String[] args) {
        Client clientOne = new LegalPerson();
        Client clientTwo = new PhysicalPerson();
        Client clientThree = new IndividualBusinessman();

        clientOne.put(200.0);
        clientTwo.put(200.0);
        clientThree.put(200.0);

        System.out.println(clientOne.displayInfo() + "\n");
        System.out.println(clientTwo.displayInfo() + "\n");
        System.out.println(clientThree.displayInfo() + "\n");

        clientOne.take(100.0);
        clientTwo.take(100.0);
        clientThree.take(100.0);

        System.out.println("\n");

        System.out.println(clientOne.displayInfo() + "\n");
        System.out.println(clientTwo.displayInfo() + "\n");
        System.out.println(clientThree.displayInfo() + "\n");
    }
}
