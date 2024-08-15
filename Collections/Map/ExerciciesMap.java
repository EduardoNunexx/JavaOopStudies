import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciciesMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int n = 4;
        search(list, n);
    }
    public static void search(List<Integer> list, int number){
        Collections.sort(list);
        Map<Integer,Integer> map= new HashMap<>();
        int find=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==number){
                System.out.println(i);
                find =1;
                break;
            }else if(map.containsKey(list.get(i))){
                System.out.println(i+" "+map.get(list.get(i)));
                find=1;
                break;
            }else{
                map.put(number-list.get(i), i);
            }
        }
        if (find==0) {
            System.out.println("Havent pair of numbers");
        }

    }

}
