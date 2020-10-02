package main.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerAndPredicatesAndSupplier {

    public static void main(String[] args) {

        Employee John = new Employee("John", 30);
        Employee Brice = new Employee("Brice", 40);
        Employee Olivier = new Employee("Olivier", 27);
        Employee Cyrielle = new Employee("Cyrielle", 32);
        Employee Philippe = new Employee("Philippe", 43);
        Employee Zouhair = new Employee("Zouhair", 28);
        Employee Charlotte = new Employee("Charlotte", 13);
        Employee Pascal = new Employee("Pascal", 36);

        List<Employee> employees = new ArrayList<>();
        employees.add(John);
        employees.add(Brice);
        employees.add(Olivier);
        employees.add(Cyrielle);
        employees.add(Philippe);
        employees.add(Zouhair);
        employees.add(Charlotte);
        employees.add(Pascal);

        System.out.println("------------Consumer: One param -> .accept(param) return void--------------");
        // .forEach using Consumer interface with anonymous class
        employees.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee.getName());
            }
        });
        System.out.println("--------------------------");
        // .forEach using Consumer interface with Lambda expression
        employees.forEach(employee -> System.out.println(employee.getName()));

        System.out.println("--------------------------");
        System.out.println("Employee over 30 years old:");
        employees.forEach(employee -> {
            if (employee.getAge() > 30) {
                System.out.println(employee.getName());
            }
        });

        System.out.println("-----------Test using Predicates: One param -> .test(param) return boolean---------------");
        printEmployeesByAge(employees, "Employee over 32 years old:", employee -> employee.getAge() > 32);
        printEmployeesByAge(employees, "Employee 32 years old and under:", employee -> employee.getAge() <= 32);

        System.out.println("------------Predicate method overriding just before use--------------");
        IntPredicate greaterThan20 = i -> i > 20;
        for (Employee employee: employees) {
            if (greaterThan20.test(employee.getAge())) {
                System.out.println(employee.getName());
            }
        }

        IntPredicate lessThan40 = i -> i < 40;

        System.out.println("-----------.And(Predicate)---------------");
        System.out.println(greaterThan20.and(lessThan40).test(30));

        employees.forEach(employee -> {
            System.out.println(employee.getName() + " : " + greaterThan20.and(lessThan40).test(employee.getAge()));
        });

        System.out.println("-----------Supplier : no param -> .get() return a result of type declared---------------");
        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(randomSupplier.get());
        }

    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        for (Employee employee: employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName() + " - " + employee.getAge());
            }
        }
    }
}

class EmployeeCopy {
    private String name;
    private int age;

    public EmployeeCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
