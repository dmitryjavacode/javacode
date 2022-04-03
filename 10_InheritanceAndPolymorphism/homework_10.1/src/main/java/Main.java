import org.checkerframework.checker.units.qual.C;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccountOne = new BankAccount();
        BankAccount bankAccountTwo = new BankAccount();
        CardAccount cardAccountOne = new CardAccount();
        DepositAccount depositAccount = new DepositAccount();

        bankAccountOne.put(5.0);
        bankAccountTwo.put(4.0);

        System.out.println("Баланс bankAccountOne: " + bankAccountOne.getAmount() + "\n" +
                "Баланс bankAccountTwo: " + bankAccountTwo.getAmount() + "\n" +
                "Баланс cardAccountOne: " + cardAccountOne.getAmount() + "\n" +
                "Баланс depositAccount: " + depositAccount.getAmount() + "\n");

        System.out.println("Перевод средств: " +
                (bankAccountOne.send(bankAccountTwo, 3.0) ? "Выполнен" : "Ошибка"));
//        bankAccountOne.send(bankAccountTwo, 3.0);

        System.out.println("\n" + "Баланс bankAccountOne: " + bankAccountOne.getAmount() + "\n" +
                "Баланс bankAccountTwo: " + bankAccountTwo.getAmount() + "\n" +
                "Баланс cardAccountOne: " + cardAccountOne.getAmount() + "\n" +
                "Баланс depositAccount: " + depositAccount.getAmount() + "\n");

        System.out.println("Перевод средств: " +
                (bankAccountTwo.send(cardAccountOne, 4.0) ? "Выполнен" : "Ошибка"));
//        bankAccountTwo.send(cardAccountOne, 4.0);

        System.out.println("\n" + "Баланс bankAccountOne: " + bankAccountOne.getAmount() + "\n" +
                "Баланс bankAccountTwo: " + bankAccountTwo.getAmount() + "\n" +
                "Баланс cardAccountOne: " + cardAccountOne.getAmount() + "\n" +
                "Баланс depositAccount: " + depositAccount.getAmount() + "\n");

        System.out.println("Перевод средств: " +
                (cardAccountOne.send(depositAccount, 2.0) ? "Выполнен" : "Ошибка"));
//        cardAccountOne.send(depositAccount, 2.0);

        System.out.println("\n" + "Баланс bankAccountOne: " + bankAccountOne.getAmount() + "\n" +
                "Баланс bankAccountTwo: " + bankAccountTwo.getAmount() + "\n" +
                "Баланс cardAccountOne: " + cardAccountOne.getAmount() + "\n" +
                "Баланс depositAccount: " + depositAccount.getAmount());
    }
}
