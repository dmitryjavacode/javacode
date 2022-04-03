public class TopManager extends Worker {
    private Company company;
    public static final int MIN_INCOME = 10_000_000;
    public static final double TOP_MANAGER_PERCENT = 1.5;

    public TopManager(int salary, Company company) {
        super(salary);
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        int salary = super.getMonthSalary();
        if (company.getIncome() > MIN_INCOME) {
            return (int) (salary + salary * TOP_MANAGER_PERCENT);
        } else {
            return salary;
        }
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }
}
