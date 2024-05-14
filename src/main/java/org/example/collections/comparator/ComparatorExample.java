package org.example.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person player1 = new Person(59, "John", 22);
        Person player2 = new Person(67, "Steven", 24);
        Person player3 = new Person(45, "Roger", 19);
        persons.add(player1);
        persons.add(player2);
        persons.add(player3);
        System.out.println(persons);

        Collections.sort(persons);
        //System.out.println(persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(persons);
    }
}
