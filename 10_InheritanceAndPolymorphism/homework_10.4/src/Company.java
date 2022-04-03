import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
//    private int income = 9_000_000;
    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    private List<Employee> getList(int count, Comparator<Employee> cmp) {
        if (count < 0) {
            System.out.println("Не правильное значение");
            return Collections.emptyList();
        }
        if (count > employees.size()) {
            count = employees.size();
        }
        employees.sort(cmp);
        return employees.subList(0, count);
    }

    public List<Employee> getTopSalaryStaff(int count) {
        return getList(count, Comparator.reverseOrder());
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return getList(count, Comparator.naturalOrder());
    }

    public void hire(Employee employee) {
        employee.setCompany(this);
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        for (Employee e : employees) {
            hire(e);
        }
    }

    public void fire(Employee employee) {
        employee.setCompany(null);
        employees.remove(employee);
    }

    public int getIncome() {
        int income = 0;
        for (Employee e : employees) {
            if (e instanceof Manager) {
                income += ((Manager) e).getSales();
            }
        }
        return income;
    }

//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return Integer.compare(o1.getMonthSalary(), o2.getMonthSalary());
//    }
}
