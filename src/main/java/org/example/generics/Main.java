package org.example.generics;

import java.util.*;

/*
Java generics are mainly used to impose type safety in programs.
its basically compile type checking and removing risk of class cast Exception
Type safety is when the compiler validates the datatype of constants, variables, and methods whether
it is rightly assigned or not.
 */
public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("prag");
        for(Object obj:list){
            String str=(String)obj;
          //  int x= (int) obj;
        }
    }
}
