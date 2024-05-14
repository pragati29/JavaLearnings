package programming2024.Januray;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1, "Pragati", 31, "Female", "IT", "Ghaziabad",
                        9, Arrays.asList("+917011038796", "+8802093574")),
                new Student(2, "Raghav", 30, "Male", "Mech", "Ghaziabad",
                        60, Arrays.asList("+917011038796", "+8130377252")),
                new Student(3, "Deepali", 31, "Female", "IT", "Delhi",
                        51, Arrays.asList("+9189144164", "+917915424653")),
                new Student(4, "Megha", 27, "Female", "IT", "Dadri",
                        35, Arrays.asList("+918800611968", "+917915424653")),
                new Student(5, "Mudit", 31, "Male", "Accounts", "Ghaziabad",
                        39, Arrays.asList("+919711671198", "+917915424653")),
                new Student(6, "Madhav", 27, "Male", "BPO", "Ghaziabad",
                        109, Arrays.asList("+919711671198", "+917915424653"))).collect(Collectors.toList());

        // Q1 list of studens between rank 50 and 100;

        //studentList.stream().filter(e->e.getRank()>50&&e.getRank()<100).collect(Collectors.toList())
        //        .forEach(e-> System.out.println(e));

        // Q2 students stays in Ghaziabad and sort them by their names;

     //   studentList.stream().filter(e-> e.getCity().equals("Ghaziabad")).sorted(Comparator.comparing(Student::getFirstName,Comparator.reverseOrder())).collect(Collectors.toList())
      //          .forEach(System.out::println);

        // Q3 Find all departments from Student List
        //studentList.stream().map(Student::getDept).collect(Collectors.toSet()).forEach(p-> System.out.println(p));

        //Q4 find all contact numbers
        // using map
       // studentList.stream().map(Student::getMobileNumbers).collect(Collectors.toList()).forEach(p-> System.out.println(p));
        //using flat map
        //studentList.stream().flatMap(s->s.getMobileNumbers().stream()).collect(Collectors.toList()).forEach(p-> System.out.println(p));

        //Q5 group students by department names
        //Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getDept));
       // collect.entrySet().forEach(p-> System.out.println(p));

        // to get the count of students related to department name
       // Map.Entry<String, Long> stringLongEntry = studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting())).entrySet().stream().
            //    max(Map.Entry.comparingByValue()).get();

        //System.out.println(stringLongEntry);

        // Q6 Find the average age of male and female students
        //     studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))).entrySet()
        //             .forEach(p-> System.out.println(p));

        // find the highest rank in each department
         //       studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.minBy(Comparator.comparing(Student::getRank))))
          //              .entrySet().forEach(r-> System.out.println(r));
       //find the second rank Student
        //List<Student> collect = studentList.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());

        //collect.forEach(r-> System.out.println(r));
        //System.out.println("Result of second rank Student "+collect.get(1) );

        // Alternate way
        Student any = studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findAny().get();
        System.out.println(any);

    }
}
