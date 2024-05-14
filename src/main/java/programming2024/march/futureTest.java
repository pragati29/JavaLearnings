package programming2024.march;

import org.example.multithreading.interthreadCommunication.problemTwo.Thread2;
import programming2024.February.C;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class futureTest {
    public static void main(String[] args) throws Exception, InterruptedException {
       List listOfString=Arrays.asList("abc","cab","rat","tar","abc","lab","bac");

       Comparator comparator=(o1,o2)->{
           char c1[]=o1.toString().toCharArray();
           Arrays.sort(c1);
           String s1=new String(c1);
           System.out.println(s1);
           char c2[]=o2.toString().toCharArray();
           Arrays.sort(c2);
           String s2=new String(c2);
           System.out.println(s2);
           return s1.compareTo(s2);
       };

       listOfString.sort(comparator);
        System.out.println(listOfString);
       // Person p=new Person("po");
       // System.out.println(p);
    }
}
