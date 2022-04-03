public class IndividualBusinessman extends Client {

    public void take(double amountToTake) {
        amountToTake += amountToTake * COMMISSION;
        super.take(amountToTake);
    }

    public void put(double amountToPut) {
        if (amountToPut >= 1000.0) {
            amountToPut -= amountToPut * LOW_PUT_COMMISSION;
        } else {
            amountToPut -= amountToPut * COMMISSION;
        }
        super.put(amountToPut);
    }

    @Override
    public String displayInfo() {
        return "Тип аккаунта: IndividualBusinessman" + "\n" +
                "Баланс: " + getAmount() + "\n" +
                "Комиссия при пополнении:\n" +
                "Сумма до 1000 рублей: " + 100 * LOW_PUT_COMMISSION + " %\n" +
                "Сумма 1000 рублей и более: " + 100 * COMMISSION + " %\n" +
                "Комиссия при снятии средств: " + 100 * COMMISSION + " %";
    }
}
