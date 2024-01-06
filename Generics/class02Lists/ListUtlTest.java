package Generics.class02Lists;

import java.util.Arrays;
import java.util.List;

public class ListUtlTest {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("js","java","sql");
        List<Integer> l2 = Arrays.asList(1,2,3,4);
        String x = (String)ListUtl.getLast(l1);
        Integer x2 = (Integer)ListUtl.getLast(l2);
        System.out.println(x+" "+x2);
        //he do the cast by himself
        String x3 = ListUtl.getLast2(l1);
        Integer x4 = ListUtl.getLast2(l2);  
    }
}
