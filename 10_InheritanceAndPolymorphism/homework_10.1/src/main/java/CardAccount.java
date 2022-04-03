public class CardAccount extends BankAccount {
    private static final double commissionAmount = 0.01;

    public void take(double amountToTake) {
        amountToTake += amountToTake * commissionAmount;
        super.take(amountToTake);
    }

    public boolean send(BankAccount receiver, double amount) {
        if (amount + amount * commissionAmount <= amountBalance) {
            amountBalance -= amount + amount * commissionAmount;
            receiver.amountBalance += amount;
            return true;
        } else {
            return false;
        }
    }
}