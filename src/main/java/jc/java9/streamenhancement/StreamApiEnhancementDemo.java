package jc.java9.streamenhancement;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEnhancementDemo {

    public static void main(String[] args) {
        List<Integer> list=List.of(2,4,3,5,6,8);
        System.out.println("======================TAKE WHILE DEMO===============================");
        System.out.println("Original List "+ list);
        List<Integer> newList=list.stream()
                                  .takeWhile(x-> x%2==0)
                                  .collect(Collectors.toList());
        System.out.println("New modified list "+newList);

        System.out.println("======================DROP WHILE DEMO===============================");
        System.out.println("Original List "+ list);
        List<Integer> newList1=list.stream()
                .dropWhile(x-> x%2==0)
                .collect(Collectors.toList());
        System.out.println("New modified list "+newList1);

        // Demo for Set

        Set<Integer> set= Set.of(1,2,3,4,5,6,7);
        Set<Integer> newSet= set.stream()
                                .takeWhile(x->x%2!=0)
                                .collect(Collectors.toSet());
        System.out.println("Set demo" + set);
        System.out.println("======================STREAM ITERATE METHOD DEMO===============================");

        Stream.iterate(1,x->x<=10,x->x+2).forEach(System.out::println);

        System.out.println("======================STREAM OF NULLABLE METHOD DEMO===============================");
        // Returns empty Stream
        Stream.ofNullable(null).forEach(System.out::println);
        // Return actual stream
        Stream.ofNullable(List.of(1,2,3,4,5)).forEach(System.out::println);











    }
}
