package jc.java9.streamenhancement;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEnhancementDemo {

    public static void main(String[] args) {
        List<Integer> list=List.of(2,3,5,6,8);
        System.out.println("======================TAKE WHILE DEMO===============================");
        System.out.println("Original List "+ list);
        List<Integer> newList=list.stream()
                                  .takeWhile(x-> x%2==0)
                                  .collect(Collectors.toList());
        System.out.println("New modified list "+newList);



    }
}
