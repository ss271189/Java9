package jc.java9.unmodifiablecollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMapDemo {
    public static void main(String[] args) {
        //Upto Java 1.8
         Map<String,String> map=new HashMap<>();
         map.put("A","Apple");
         map.put("B","Bat");
         map.put("C","Cat");
         Map<String,String> mapUnmodifiable= Collections.unmodifiableMap(map);

         // From Java 1.9 for creating upto 0 to 10 Entries
        Map<String,String> mapNew= Map.of("A","Apple","B","Ball","C","Cat");
        //Map<String,String> mapNew= Map.of("A","Apple","B","Ball","C",); Compile time issue
        //Map<String,String> mapNew= Map.of("A","Apple",null,"Ball","C","Cat"); NullPointerException
        //Map<String,String> mapNew= Map.of("A",null,"B","Ball","C","Cat"); NullPointerException
        System.out.println("mapNew is object of "+mapNew.getClass().getCanonicalName() );
        // mapNew.put("D","Dog");  UnsupportedOperationException

        // For more than 10 Entries

        Map.Entry<Integer,String> e1=Map.entry(101,"Durga");
        Map.Entry<Integer,String> e2=Map.entry(102,"Durga");
        Map.Entry<Integer,String> e3=Map.entry(103,"Durga");
        Map.Entry<Integer,String> e4=Map.entry(104,"Durga");
        Map.Entry<Integer,String> e5=Map.entry(105,"Durga");
        Map.Entry<Integer,String> e6=Map.entry(106,"Durga");
        Map.Entry<Integer,String> e7=Map.entry(107,"Durga");
        Map.Entry<Integer,String> e8=Map.entry(108,"Durga");
        Map.Entry<Integer,String> e9=Map.entry(109,"Durga");
        Map.Entry<Integer,String> e10=Map.entry(110,"Durga");
        Map.Entry<Integer,String> e11=Map.entry(111,"Durga");
        Map.Entry<Integer,String> e12=Map.entry(112,"Durga");

        Map<Integer,String> mapOfEntries= Map.ofEntries(e1,e2,e3,e4,e6,e7,e8,e9,e10,e11,e12);
        //Map<Integer,String> mapOfEntries= Map.ofEntries(e1,e2,e3,e4,e6,e7,e8,e9,e10,e11,e12,null); NullPointerException
        //mapOfEntries.put(1,"Test"); UnsupportedOperationException
        // Please note that Entry is also Immutable object and cant be modified



    }
}