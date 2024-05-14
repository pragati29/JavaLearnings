package org.example.collections.comparator;

public class Person implements Comparable<Person> {
    private int ranking;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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
    public int compareTo(Person o2 ) {
        return this.getRanking()-o2.getRanking() ;
    }
}
