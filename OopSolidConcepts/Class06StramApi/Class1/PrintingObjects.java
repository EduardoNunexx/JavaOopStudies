package OopSolidConcepts.Class06StramApi.Class1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Iterator;



public class PrintingObjects {
    public static void main(String[] args) {

        //we have some ways to pass for a vector and show his values    
        List<String> list1 = Arrays.asList("jhon","james","jeff","joe");
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        //the first way to print our list elements 
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        System.out.println("\n");
        //the second way are using for each 
        for (String i:list1){
            System.out.println(i);
        }
        System.out.println("\n");
        //the third way is using the iterator interface
        //instancing the iterator 
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //Lastly we can use the stream 
        Stream<Integer> stream = list2.stream();
        stream.forEach(System.out::println);
        
    }

}
