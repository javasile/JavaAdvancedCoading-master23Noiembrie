package exercitiu7;

import java.util.List;

public class EmployeeSelection {

    public static Employee select(List<Employee> employees){
        if (employees == null){
            return null;
        }

        return employees.stream ().filter (employee -> employee != null && employee.getSalary () >= 30000)
                .findFirst ().get ();
    }
}
