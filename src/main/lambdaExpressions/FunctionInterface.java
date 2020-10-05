package main.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class FunctionInterface {

    public static void main(String[] args) {

        Employee John = new Employee("John Marx", 30);
        Employee Brice = new Employee("Brice Junoy", 40);
        Employee Olivier = new Employee("Olivier Colombies", 27);
        Employee Cyrielle = new Employee("Cyrielle Dol", 32);
        Employee Philippe = new Employee("Philippe Cohen", 43);
        Employee Zouhair = new Employee("Zouhair Et-Taousy", 28);
        Employee Charlotte = new Employee("Charlotte Guillemet", 13);
        Employee Pascal = new Employee("Pascal Baptiste", 39);

        List<Employee> employees = new ArrayList<>();
        employees.add(John);
        employees.add(Brice);
        employees.add(Olivier);
        employees.add(Cyrielle);
        employees.add(Philippe);
        employees.add(Zouhair);
        employees.add(Charlotte);
        employees.add(Pascal);

        System.out.println("----------Function that return the lastName by taking an employee------------");
        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);


        System.out.println("----------Function that return the firstName by taking an employee------------");
        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };
        String firstName = getFirstName.apply(employees.get(1));
        System.out.println(firstName);


        System.out.println("----------The same function but take a List of Employee and return a List of String (corresponding to the lastName)-----------");
        Function<List<Employee>, List<String>> getListOfLastNamesFromEmployeesList = (List<Employee> listEmployees) -> {
            List<String> listLastNames = new ArrayList<>();
            listEmployees.forEach(employee -> {
                String lastName2 = employee.getName().substring(employee.getName().indexOf(' ') + 1);
                listLastNames.add(lastName2);
            });
            return listLastNames;
        };

        List<String> lastNames = getListOfLastNamesFromEmployeesList.apply(employees);
        lastNames.forEach(str -> System.out.println(str));

        System.out.println("----------Using the static method getAName that uses a Function<Employee, String> in parameter---------");
        Random random = new Random();
        for (Employee employee: employees) {
            if(random.nextBoolean()) {
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }


        System.out.println("-----------Chaining functions----------");
        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> getFirstName2 = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(getFirstName2);
        System.out.println(chainedFunction.apply(employees.get(0)));


        System.out.println("-----------BiFunction: two arguments and return one----------");
        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));


        System.out.println("-----------UnaryOperator: One argument return value that have the same type as argument----------");
        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));
    }

    private static String getAName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);
    }
}
