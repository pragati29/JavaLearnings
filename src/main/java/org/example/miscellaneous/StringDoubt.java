package org.example.miscellaneous;

public class StringDoubt extends Object{
    public static void main(String[] args) {
        String s="Pragati";
        String s1=new String("Pragati");
        String s2="Pragati";
        System.out.println(s.equals(s1));
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String sp = new String("Aeki");
        String sp1 = new String("Aeki");
        String sp2 = new String("Aeki");

        System.out.println(sp1.hashCode());
        System.out.println(sp2.hashCode());
        System.out.println(sp1.equals(sp2));

        // how many object got created of string in line 5-7
    }
}
