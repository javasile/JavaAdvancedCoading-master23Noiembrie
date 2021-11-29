package comparatii;

import java.util.*;

public class MainCompare {
    public static void main(String[] args) {

        Employee ionelGeorgescu = new Employee().setNume("Ionel").setPrenume("Georgescu").setAdresa("Romania").setCnp("456");
        Employee ionelPopescu = new Employee().setNume("IONEL").setPrenume("POPESCU").setAdresa("Romania").setCnp("Z123");
        Employee ionelPopescu2 = new Employee().setNume("IONEL").setPrenume("POPESCU").setAdresa("Romania").setCnp("z123");
        Employee ionelPopescu3 = ionelPopescu;
        Employee georgelPopescu = new Employee().setNume("Georgel").setPrenume("POPESCU").setAdresa("Romania").setCnp("789");

        List<Employee> employees = new ArrayList<>() {{
            add(ionelPopescu);
            add(ionelGeorgescu);
            add(georgelPopescu);
            add(ionelPopescu2);
            add(ionelPopescu3);
        }};

        employees.stream().sorted().forEach(employee -> System.out.println(employee));
//
//        System.out.println("ionelPopescu equals cu ionelPopescu2 ? : " + ionelPopescu.equals(ionelPopescu2));
//        System.out.println("Hashcode IP vs IP2: " + ionelPopescu.hashCode() + " vs " + ionelPopescu2.hashCode());
//
//        // -------------------------------------------------------------------------------------------
//        System.out.println("ionelPopescu == ionelPopescu2 ? : " + (ionelPopescu == ionelPopescu2));
//        System.out.println("ionelPopescu == ionelPopescu3 ? : " + (ionelPopescu == ionelPopescu3));

        System.out.println("--------------------------------------------------------------------------------------------");

        Map<String, Employee> employeesMap = new HashMap<>() {{
            put(ionelPopescu.getCnp().toLowerCase(), ionelPopescu);
            put(ionelGeorgescu.getCnp().toLowerCase(), ionelGeorgescu);
            put(georgelPopescu.getCnp().toLowerCase(), georgelPopescu);
            put(ionelPopescu2.getCnp().toLowerCase(), ionelPopescu2);
            put(ionelPopescu3.getCnp().toLowerCase(), ionelPopescu3);
        }};

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(employeesMap);

        System.out.println("--------------------------------------------------------------------------------------------");

        Set<Employee> employeesSet = new HashSet<>() {{
            add(ionelPopescu);
            add(ionelGeorgescu);
            add(georgelPopescu);
            add(ionelPopescu2);
            add(ionelPopescu3);
        }};

        System.out.println(employeesSet);
    }
}
