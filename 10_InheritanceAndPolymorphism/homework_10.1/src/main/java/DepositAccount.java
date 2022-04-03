import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            lastIncome = LocalDate.now();
            super.put(amountToPut);
        }
    }

    public void take(double amountToTake) {
        if (lastIncome.minusMonths(1).isBefore(lastIncome)) {
            super.take(amountToTake);
        }
    }

    public boolean send(BankAccount receiver, double amount) {
        if (lastIncome.minusMonths(1).isBefore(lastIncome)) {
            return super.send(receiver, amount);
        } else {
            return false;
        }
    }
}
