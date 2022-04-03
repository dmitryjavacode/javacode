import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Создаем компании
        Company company = new Company();
        Company company2 = new Company();

        // Нанимаем сотрудников одиночный метод hire (company)
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator(30000));
        }
        // Создаем список для массова приема сотрудников (company)
        List<Employee> workers = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            workers.add(new Manager(40000));
            if (i % 8 == 0) {
                workers.add(new TopManager(50000, company));
            }
        }
        // Нанимаем список сотрудников hireAll (company)
        company.hireAll(workers);
        // Выводим список зарплат сотрудников (company)
        printEmployees(company);

        // Берем список сотрудников и увольняем (company)
        List<Employee> employees = company.getEmployees();
        System.out.println("Список сотрудников (company): " + employees.size());
        for (int i = 0; i < 135; i++) {
            company.fire(employees.get(i));
        }

        // Выводим список зарплат сотрудников после увольнения (company)
        printEmployees(company);
        System.out.println("----------------------");
        System.out.println("Список сотрудников (company) после увольнения: " + company.getEmployees().size());

        // Нанимаем сотрудников в company2 одиночный метод hire (company2)
        for (int i = 0; i < 250; i++) {
            company2.hire(new Operator(45000));
        }
        // Создаем список для массова приема сотрудников (company2)
        List<Employee> workers2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            workers2.add(new Manager(65000));
        }
        for (int i = 0; i < 30; i++) {
            workers2.add(new TopManager(80000, company2));
        }
        // Нанимаем список сотрудников hireAll (company2)
        company2.hireAll(workers2);
        // Выводим список зарплат сотрудников (company2)
        printEmployees(company2);

        // Берем список сотрудников и увольняем (company2)
        List<Employee> employees2 = company2.getEmployees();
        System.out.println("Кол-во сотрудников (company2): " + employees2.size());
        for (int i = 0; i < 190; i++) {
            company2.fire(employees2.get(i));
        }

        // Выводим список зарплат сотрудников после увольнения (company2)
        printEmployees(company2);
        System.out.println("----------------------");
        System.out.println("Кол-во сотрудников (company2) после увольнения: " + company2.getEmployees().size());

    }

    public static void printEmployees(Company company) {
        System.out.println("---------------------");
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(15);
        for (Employee e : topSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
        System.out.println("---------------------");
        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(30);
        for (Employee e : lowSalaryStaff) {
            System.out.println(e.getMonthSalary());
        }
    }
}
