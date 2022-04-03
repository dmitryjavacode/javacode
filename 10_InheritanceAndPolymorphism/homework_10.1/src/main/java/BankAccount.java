public class BankAccount {
    protected double amountBalance;

    public double getAmount() {
        return amountBalance;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amountBalance += amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amountToTake <= amountBalance) {
            amountBalance -= amountToTake;
        }
    }

    public boolean send(BankAccount receiver, double amount) {
        if (amount <= amountBalance) {
            amountBalance -= amount;
            receiver.amountBalance += amount;
            return true;
        } else {
            return false;
        }
    }
}
