package Collections.Map;

//to make the first declaration you must to import this 
import java.util.Map;
import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
        // to declare
        Map<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        // implementing some methods

        // to add
        map.put(1, "jao");
        map.put(2, "juim");
        map.put(3, "jon");
        map2.put(1,"jao");
        map2.put(2,"juin");
        map2.put(3,"jon");
        map2.put(5,"Teus");

        //to get all keys
        map.keySet(); 
        System.out.println(map2.keySet());

        //to get all values
        map.values();
        System.out.println(map2.values());

        //to get all keys and values 
        map.entrySet();
        System.out.println(map2.entrySet());
        
        //to check if conteins some value/ke 
        map.containsValue("jao");
        map.containsKey(5);
        System.out.println(map2.containsKey(5));

        // some loops to get all the values and keys
        for(Integer aux:map.keySet()){
            System.out.println(aux);
        }
        for(String aux:map.values()){
            System.out.println(aux);
        }
        //getting the keys and values in the same time
        for(Map.Entry<Integer,String> aux: map2.entrySet()){
            System.out.println(aux.getKey());
            System.out.println(aux.getValue());
        }
    }

}
