package Generics.class02Lists;

import java.util.List;

public interface ListUtl {
    //how you dont know the type of list that you will recieve 
    //you sett ? to get all list types
    public static Object getLast(List<?> x){
        return x.get(x.size()-1);
    }
    public static <T> T getLast2(List<T> x){
        return x.get(x.size()-1);
    }
}
