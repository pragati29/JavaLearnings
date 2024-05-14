package programming2024.February;

import programming2024.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Scenario {

    static List<Employee> employees;
    private static void populateEmployeeList() {
        employees=new ArrayList<>();
        employees.add(new Employee(1, "Alice", 25000, "Marketing", "alice@gmail.com", "New York"));
        employees.add(new Employee(2, "Bob", 35000, "Sales", "bob@hotmail.com", "Los Angeles"));
        employees.add(new Employee(3, "Charlie", 35000, "Finance", "charlie@yahoo.com", "Chicago"));
        employees.add(new Employee(4, "David", 40000, "IT", "david@gmail.com", "Houston"));
        employees.add(new Employee(5, "Eve", 45000, "HR", "eve@gmail.com", "Phoenix"));
        employees.add(new Employee(6, "Frank", 50000, "Marketing", "frank@outlook.com", "Philadelphia"));
        employees.add(new Employee(7, "Grace", 55000, "Sales", "grace@gmail.com", "San Antonio"));
        employees.add(new Employee(8, "Harry", 60000, "Finance", "harry@gmail.com", "San Diego"));
        employees.add(new Employee(9, "Ivy", 80000, "IT", "ivy@gmail.com", "Dallas"));
        employees.add(new Employee(10, "Jack", 70000, "HR", "jack@gmail.com", "San Jose"));
        employees.add(new Employee(11, "Kate", 70000, "Marketing", "kate@outlook.com", "Austin"));
        employees.add(new Employee(12, "Leo", 80000, "Sales", "leo@gmail.com", "Jacksonville"));
        employees.add(new Employee(13, "Mary", 85000, "Finance", "mary@yahool.com", "San Francisco"));
        employees.add(new Employee(14, "Nick", 80000, "IT", "nick@gmail.com", "Indianapolis"));
        employees.add(new Employee(15, "Olivia", 95000, "HR", "olivia@gmail.com", "Columbus"));
        employees.add(new Employee(16, "Peter", 100000, "Marketing", "peter@hotmail.com", "Fort Worth"));
        employees.add(new Employee(17, "Quinn", 105000, "Sales", "quinn@gmail.com", "Charlotte"));
        employees.add(new Employee(18, "Ryan", 110000, "Finance", "ryan@yahoo.com", "Detroit"));
        employees.add(new Employee(19, "Sophia", 120000, "IT", "sophia@gmail.com", "El Paso"));
        employees.add(new Employee(20, "Alan", 120000, "HR", "tom@yahoo.com", "Seattle"));
    }
    public static void main(String[] args) {
    populateEmployeeList();
    //How would you use the Stream API to find the average salary of all employees?
        OptionalDouble average = employees.stream().mapToDouble(Employee::getSalary).average();
        //System.out.println(average.getAsDouble());
    //How would you use the Stream API to group employees by department and count the number of employees in each department?
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
       // System.out.println(collect);
     //   collect.entrySet().forEach(s-> System.out.println(s));
        //How would you use the Stream API to filter employees by department and sort them by name in ascending order?

        employees.stream().filter(s -> s.getDepartment().equals("HR")).
                sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

       //How would you use the Stream API to find the employee with the highest salary in each department?
        Map<String, Optional<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        //System.out.println(collect1);
         //How would you use the Stream API to create a map of employee names and salaries?
        Map<String, Double> collect2 = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
      //  System.out.println(collect2);
        Map<String, Set<Double>> collect3 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.toSet())));
       // System.out.println(collect3);

       // employees.stream().filter(e->e.getDepartment().equals("Finance")).map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);

        List<String> str=new ArrayList<>();
        Employee employee = employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        System.out.println(employee);
    }

}
