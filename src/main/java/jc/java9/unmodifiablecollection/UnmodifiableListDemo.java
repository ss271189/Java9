package jc.java9.unmodifiablecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {

    public static void main(String[] args) {
        // Upto Java 1.8
        List<String> list= new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        List<String> listImmutable= Collections.unmodifiableList(list);

        //From Java 1.9

        List<String> listNew=List.of("A","B","C","D","E","F");
        // List<String> listNew=List.of("A","B","C","D","E",null);   NullPointerException
        System.out.println("listNew is Object of "+listNew.getClass().getName());

       //  listNew.add("aa"); UnsupportedOperationException

    }
}
