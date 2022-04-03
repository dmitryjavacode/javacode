import java.util.Scanner;


public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static Command command;
    public static EmailList emailList = new EmailList();
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String inputMail = "";
            if (input.equals("0")) {
                break;
            }
            //TODO: write code here
            int indexAfterCommand = input.indexOf(' ');
            if (input.equals("LIST")) {
                command = Command.LIST;
            } else {
                command = Command.valueOf(input.substring(0, indexAfterCommand));
                inputMail = input.substring(indexAfterCommand).trim();
            }

            switch (command) {
                case ADD:
                    emailList.add(inputMail);
                    continue;
                case LIST:
                    for (String mail : emailList.getSortedEmails()) {
                        System.out.println(mail);
                    }
                    continue;
                default:
                    System.out.println();
            }
        }
    }

    enum Command {
        ADD, LIST
    }
}
