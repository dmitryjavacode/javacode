import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            ArrayList<String> arrayList = todoList.getTodos();
            int indexAfterCommand = input.indexOf(' ');
            int indexDeal = -1;
            String deal = "";
            TodoCommands type;

            if (input.equals("LIST")) {
                type = TodoCommands.LIST;
            } else {
                type = TodoCommands.valueOf(input.substring(0, indexAfterCommand));

                if (Character.isDigit(input.charAt(indexAfterCommand + 1))) {
                    indexDeal = checkIndex(input.substring(indexAfterCommand, input.indexOf(' ', indexAfterCommand + 1)));
                    deal = input.substring(input.indexOf(' ', indexAfterCommand + 1)).trim();
                } else {
                    deal = input.substring(indexAfterCommand).trim();
                }
            }


            switch (type) {
                case ADD:
                    if (indexDeal == -1) {
                        todoList.add(deal);
                        continue;
                    } else {
                        todoList.add(indexDeal, deal);
                        continue;
                    }
                case EDIT:
                    todoList.edit(deal, indexDeal);
                    continue;
                case DELETE:
                    todoList.delete(indexDeal);
                    continue;
                case LIST:
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(i + " - " + arrayList.get(i));
                    }
                    continue;
                default:
                    System.out.println("Ошибка! Неверная команда.");
            }
        }
    }

    public static int checkIndex(String text) {
        String regex = "[0-9]{1,9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int result = -1;
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            result = Integer.valueOf(text.substring(start, end));
        }

        return result;
    }
}
