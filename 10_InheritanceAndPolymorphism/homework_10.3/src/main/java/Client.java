public abstract class Client {
    protected double amountBalance;
    protected static final double COMMISSION = 0.01;
    protected static final double LOW_PUT_COMMISSION = 0.005;

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

    public abstract String displayInfo();
}
