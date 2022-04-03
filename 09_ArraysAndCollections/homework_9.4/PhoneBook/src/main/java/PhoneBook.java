import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private TreeMap<String, String> phoneBookDirectory = new TreeMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (checkName(name) && checkPhone(phone)) {
            phoneBookDirectory.put(phone, name);
            System.out.println("Контакт сохранен!");
        } else {
            System.out.println("Неверный формат ввода");
        }
    }

    public String getNameByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String result = "";
        if (!(phoneBookDirectory.get(phone) == null)) {
            result = phoneBookDirectory.get(phone) + " - " + phone;
        }
        return result;
    }

    public Set<String> getPhonesByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> phonesByName = new TreeSet<>();
        boolean countPhones = false;
        String resultSearch = "";
        if (phoneBookDirectory.values().contains(name)) {
            for (String key : phoneBookDirectory.keySet()) {
                if (phoneBookDirectory.get(key).contains(name)) {
                    if (countPhones) {
                        resultSearch += ", " + key;
                        continue;
                    }
                    resultSearch += phoneBookDirectory.get(key) + " - " + key;
                    countPhones = true;
                }
            }
            phonesByName.add(resultSearch);
        }
        return phonesByName;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> allContacts = new TreeSet<>();
        if (!phoneBookDirectory.isEmpty()) {
            for (String key : phoneBookDirectory.keySet()) {
                if (Collections.frequency(phoneBookDirectory.values(), phoneBookDirectory.get(key)) > 1) {
                    allContacts.addAll(getPhonesByName(phoneBookDirectory.get(key)));
                } else {
                    allContacts.add(phoneBookDirectory.get(key) + " - " + key);
                }
            }

        }
        return allContacts;
    }

    public static boolean checkName(String name) {
        String regexName = "^[А-Я][а-я]+$";
        boolean result = false;
        Pattern patternName = Pattern.compile(regexName);
        Matcher matcherName = patternName.matcher(name);
        if (matcherName.find()) {
            result = true;
        }
        return result;
    }

    public static boolean checkPhone(String phone) {
        String regexPhone = "^[0-9]{11}$";
        boolean result = false;
        Pattern patternPhone = Pattern.compile(regexPhone);
        Matcher matcherPhone = patternPhone.matcher(phone);
        if (matcherPhone.find()) {
            result = true;
        }
        return result;
    }
}