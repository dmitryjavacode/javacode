public class LegalPerson extends Client {

    public void take(double amountToTake) {
        amountToTake += amountToTake * COMMISSION;
        super.take(amountToTake);
    }

    @Override
    public String displayInfo() {
        return "Тип аккаунта: LegalPerson" + "\n" +
                "Баланс: " + getAmount() + "\n" +
                "Комиссия при снятии средств: " + 100 * COMMISSION + " %\n" +
                "Комиссия при пополнении не взимается.";
    }
}
