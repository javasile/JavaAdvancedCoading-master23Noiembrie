package exercitiu7;

import java.util.ArrayList;
import java.util.List;

public class StartEmploy {
    static Employee employee1 = new Employee ("John", "emp011", 20000.00);
    static Employee employee2 = new Employee ("John", "emp012", 40000.00);
    static Employee employee3;

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<> ();
        employeeList.add (employee1);
        employeeList.add (employee2);
        employeeList.add (employee3);

        System.out.println (employeeList);
        System.out.println (new EmployeeSelection ().select(employeeList));
    }
}
