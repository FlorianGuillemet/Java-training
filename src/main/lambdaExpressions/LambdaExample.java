package main.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

    /*
    The lambda expression is an another way to use the anonymous classes.
    It use a simplify syntax, more smart, conciseness

    The lambda expression is the definition of a interface method (functional interface that only have one method to define)
    To use it, first we must choose or written the appropriate interface: with or without params, with or without return, and the type of params and return.
    Then we define what this method have to do.
    Finally, we call this method (with the params) to execute the function.

    The definition of the interface method can be done on the fly or in a class method (to be reused).
     */

    public static void main(String[] args) {

        Employee John = new Employee("John", 30);
        Employee Brice = new Employee("Brice", 40);
        Employee Olivier = new Employee("Olivier", 27);
        Employee Cyrielle = new Employee("Cyrielle", 32);

        List<Employee> employees = new ArrayList<>();
        employees.add(John);
        employees.add(Brice);
        employees.add(Olivier);
        employees.add(Cyrielle);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        // // Or this syntax without anonymous class
        // Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }

        // Reorder from age
        // Collections.sort(employees, (employee1, employee2) -> Integer.valueOf(employee1.getAge()).compareTo(employee2.getAge()));
        Collections.sort(employees, (employee1, employee2) -> Integer.compare(employee1.getAge(), employee2.getAge()));

        for (Employee employee: employees) {
            System.out.println(employee.getName() + " : " + employee.getAge());
        }

        // Another use case by defining our own interface (see at the end of the script)
        String sillyString = doStringStuff(new TwoStringReturnOne() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        // the same but with lambda expression syntax
        String sillyString2 = doStringStuff((s1, s2) -> s1.toUpperCase() + s2.toUpperCase(),
                employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString2);

        // another way consist in define the method of the interface before her call.
        TwoStringReturnOne upperAndConcat = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        // The function called afterwards knows what it has to do
        String anotherString = doStringStuff(upperAndConcat, employees.get(2).getName(), employees.get(3).getName());
        System.out.println(anotherString);
        // Here, we directly use the interface method.
        String anotherUse = upperAndConcat.upperAndConcat(employees.get(2).getName(), employees.get(3).getName());
        System.out.println(anotherUse);

        // Using a class to reuse the lambda expression without redefining expression concat.
        AnotherClass anotherClass = new AnotherClass();
        String byUsingClassToReuse = anotherClass.upperConcat("String1", "String2");
        System.out.println(byUsingClassToReuse);

    }

    /*
    Same methods principle as the Collections.sort(List<T> list, Comparator<? super T> c) method
     */
    public final static String doStringStuff(TwoStringReturnOne uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
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

interface TwoStringReturnOne {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String upperConcat(String str1, String str2) {
        // here we define what the interface method have to do
        TwoStringReturnOne uc = ((s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            return s1.toUpperCase() + s2.toUpperCase();
        });
        // here we execute this method
        return uc.upperAndConcat(str1, str2);
        // return LambdaComparator.doStringStuff(uc, str1, str2);
    }
}
