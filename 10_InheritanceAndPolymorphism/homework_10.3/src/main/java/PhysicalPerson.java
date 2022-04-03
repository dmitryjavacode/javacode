public class PhysicalPerson extends Client {
    @Override
    public String displayInfo() {
        return "Тип аккаунта: PhysicalPerson" + "\n" +
                "Баланс: " + getAmount() + "\n" +
                "Комиссия при снятии и пополнении не взимается.";
    }
}
