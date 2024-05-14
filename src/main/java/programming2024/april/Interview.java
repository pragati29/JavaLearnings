package programming2024.april;

import org.example.java8Examples.completableFuture.dto.Person;

import java.util.HashMap;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {

        Person p1 = new Person(1, "abc");
        Person p2 = new Person(1, "abc");


        Map<Person, String> per = new HashMap<>();
        per.put(p1, "1");
        per.put(p2, "2");

        System.out.println(per.size());
        System.out.println(per.get(p1));

    }
}
