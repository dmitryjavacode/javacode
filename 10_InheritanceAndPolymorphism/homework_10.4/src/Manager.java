public class Manager extends Worker {
    private int sales  = (int) (Math.random() * (140000 - 115000) + 115000);
    private static final double MANAGER_PERCENT = 0.05;

    public Manager(int salary) {
        super(salary);
    }

    @Override
    public int getMonthSalary() {
        return (int) (super.getMonthSalary() + MANAGER_PERCENT * sales);
    }

    public int getSales() {
        return sales;
    }
}
