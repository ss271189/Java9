package jc.java9.unmodifiablecollection;

import java.util.*;

public class UnmodifiableSetDemo {

    public static void main(String[] args) {

        // Upto Java 1.8
        Set<String> set= new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        Set<String> listImmutable= Collections.unmodifiableSet(set);

        //From Java 1.9

        Set<String> setNew=Set.of("A","B","C","D","E","F");
        // Set<String> setNew=Set.of("A","B","C","D","E",null);   //NullPointerException
        //Set<String> setNew=Set.of("A","B","C","D","E","A"); // IllegalArgumentException
        System.out.println("setNew is Object of "+setNew.getClass().getName());

        //  setNew.add("aa"); UnsupportedOperationException

    }
}
