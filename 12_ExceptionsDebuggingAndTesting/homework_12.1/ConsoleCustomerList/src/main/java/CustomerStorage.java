import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    private static final String REGEX_MAIL = "^[A-Za-z0-9]+[A-Za-z0-9\\_\\-\\.]*[@]{1}[a-z]+[\\.]{1}[a-z]{2,}$";
    private static final String REGEX_PHONE = "[+][7][0-9]{10}";

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws ArrayIndexOutOfBoundsException {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Wrong command!");
        } else if (!components[INDEX_PHONE].matches(REGEX_PHONE)) {
             throw new IllegalArgumentException("Wrong phone!");
        } else if (!components[INDEX_EMAIL].matches(REGEX_MAIL)) {
            throw new IllegalArgumentException("Wrong e-mail!");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];

        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}