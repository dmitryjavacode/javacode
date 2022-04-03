public abstract class Worker implements Employee {
    private int salary;

    public Worker(int salary) {
        this.salary = (int) ((Math.random() * salary) + salary);
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
