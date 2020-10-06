package main.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
An intermediate operation return a Stream value
While a final operation return void

When a chain is evaluated, a stream pipeline is created.
The stream pipeline consists of a source, zero or more intermediate operations, and a terminal operation.

We can use collection as the source, but we could also use an array or an I/O channel, and we can build streams from scratch

A Stream is typed.

When we use:

.stream(): we build a Stream pipeline that contains all the items in the collection list, in the same order

.map(Function<T, R> function): we realize an operation on the stream value. used by example to transform the value

.filter(Predicate<T> predicate): we select or filter the value when the .test(value) of the predicate is true

.distinct(): remove duplicate objects

.peek(Consumer<T> .): to use a Consumer (like System.out::println), but not in a end operation as .foreach(Consumer<T>)

.foreach(Consumer<T> .)

.count(): end operation, count elements

 */
public class Streams {

    public static void main(String[] args) {

        List<String> someBingNumbers = Arrays.asList(
                "N40", "B6",
                "N36", "B12",
                "G53", "G05", "G66", "G07", "g04", "g61", "g61",
                "X15", "C22",
                "Y84", "T63",
                "T74", "I26",
                "O71", "P57");

        System.out.println("----------Select G (including g) numbers and then sort them in alphabetical order.---------");
        List<String> gNumbers = new ArrayList<>();

        // select G and g numbers, and convert them to uppercase
        someBingNumbers.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) {
                gNumbers.add(number.toUpperCase());
            }
        });

        // sort them
        Collections.sort(gNumbers, (String s1, String s2) ->
                    s1.toUpperCase().compareTo(s2.toUpperCase())
                );

        // print them
        gNumbers.forEach(number -> System.out.println(number));


        System.out.println("----------The same using Stream---------");
        someBingNumbers.stream()
                .map(String::toUpperCase)
                .filter(number -> number.startsWith("G"))
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------With others operations. A little bit more complex---------");
        someBingNumbers.stream()
                .map(String::toUpperCase)
                .filter(number -> number.startsWith("G"))
                .peek(System.out::println)
                .filter(number -> number.contains("6"))
                .map(str -> str.concat(" super Bingo !"))
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("----------Collect into a List----------------");
        List<String> sortedGNumbers = someBingNumbers.stream()
                .map(String::toUpperCase)
                .filter(number -> number.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());
                // .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        for (String str: sortedGNumbers) {
            System.out.println(str);
        }

        System.out.println("----------Create a Stream from scracth---------");
        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        // System.out.println("Count: " + concatStream.count());
        System.out.println("Count after using distinct: " + concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        System.out.println("--------------------------------------------------");
        System.out.println("----------FlatMap method-----------");
        Employee John = new Employee("John Marx", 30);
        Employee Brice = new Employee("Brice Junoy", 40);
        Employee Olivier = new Employee("Olivier Colombies", 27);
        Employee Cyrielle = new Employee("Cyrielle Dol", 32);
        Employee Philippe = new Employee("Philippe Cohen", 43);
        Employee Zouhair = new Employee("Zouhair Et-Taousy", 28);
        Employee Charlotte = new Employee("Charlotte Guillemet", 13);
        Employee Pascal = new Employee("Pascal Baptiste", 39);

        Project ci5 = new Project("Ci5");
        ci5.addEmployee(Brice);
        ci5.addEmployee(Olivier);
        ci5.addEmployee(Cyrielle);
        ci5.addEmployee(Pascal);

        Project naval = new Project("Naval");
        naval.addEmployee(Zouhair);

        List<Project> projects = new ArrayList<>();
        projects.add(ci5);
        projects.add(naval);
        projects.stream()
                .flatMap(project -> project.getEmployees().stream())
                .forEach(System.out::println);

        System.out.println("--------Reduce method to select the youngest employee-------------");
        projects.stream()
                .flatMap(project -> project.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2 )
                .ifPresent(System.out::println);
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

    @Override
    public String toString() {
        return name;
    }
}

class Project {
    private String name;
    private List<Employee> employees;

    public Project(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

}
