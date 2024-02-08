package org.example.miscellaneous;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
       List<Employee> employeeList=Stream.of(new Employee(1,"DEV",20000),
               new Employee(2,"DEV",80000),
               new Employee(4,"QA",50000),
               new Employee(5,"QA",30000),
               new Employee(6,"DEV",75000),
               new Employee(7,"AWS",90000)).collect(Collectors.toList());
       //sortByNameAndThenSalary(employeeList);
        Comparator<Employee> comparingBySalary = Comparator.comparing(Employee::getSalary);

        Optional<Employee> employeeMap = employeeList.stream().collect(Collectors.reducing(BinaryOperator.maxBy(comparingBySalary)));
        System.out.println(employeeMap);
       // employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
        Optional<Employee> employeee= employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
       // System.out.println(employeee.get());
   //     System.out.println(employeeMap);
    }

    void ownlambdaexpression(){
        MyFunction myFunctionMethod = (a,b) -> {
            System.out.println("My Function method " +a+" "  +b);
            return a.length()+b.length();
        };
        System.out.println(myFunctionMethod.test("praga","agg"));
    }

    void functionInterFunction(){
        Function<Integer,String> func=(t)-> "output "+t;
        System.out.println(func.apply(3));
    }

    static void sortByNameAndThenSalary(List<Employee> employeeList){
        Comparator<Employee> byId=(e1,e2)->Integer.compare(e1.getSalary(), e1.getSalary());
        Comparator<Employee> byDepat=(e1,e2)->e2.getDepartmentName().compareToIgnoreCase(e1.getDepartmentName());
        employeeList.stream().sorted(byDepat.thenComparing(byId)).forEach(System.out::println);
    }
}
