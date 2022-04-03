import java.util.*;

public class Main {
    private static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        String phone;
        String name;

        while (true) {
            System.out.println("Введите номер, имя или команду");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
            } else if (PhoneBook.checkPhone(input)) {
                if (phoneBook.getNameByPhone(input).equals("")) {
                    phone = input;
                    System.out.println("Такого номера нет в телефонной книге.\n" +
                            "Введите имя абонента для номера: " + "\"" + phone + "\"");
                    name = scanner.nextLine();
                    phoneBook.addContact(phone, name);
                } else {
                    phoneBook.getPhonesByName(phoneBook.getNameByPhone(input));
                }
            } else if (PhoneBook.checkName(input)) {
                if (phoneBook.getPhonesByName(input).isEmpty()) {
                    name = input;
                    System.out.println("Такого имени в телефонной книге нет.\n" +
                            "Введите номер телефона для абонента " + name);
                    phone = scanner.nextLine();
                    phoneBook.addContact(phone, name);
                } else {
                    phoneBook.getPhonesByName(input);
                }
            } else if (!(PhoneBook.checkName(input) && PhoneBook.checkPhone(input))) {
                System.out.println("Неверный формат ввода");
            } else if (input.equals("EXIT")) {
                break;
            }
        }
    }
}
