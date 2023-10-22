package Collections.Sets;

import java.util.HashSet;
//an collection that dont get repeated elements and dont care about the order
public class Set {
    //removing the warnings 
    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        // how to declare
        HashSet conjunto = new HashSet();
        Set conjunto2= new Set();
        // some methods commons to all collections

        //add a new element in the collection
        conjunto.add(1);
        //remember that, in a set collection you cant save repeated elements 
        conjunto.add(1);
        conjunto.add(2);
        //remove an collection element
        conjunto.remove(2);
        //checking if the collection has sany especified element 
        conjunto.contains(0);
        System.out.println(conjunto);
        //union of two collections 
        HashSet x = new HashSet();
        x.add(1);
        x.add(2);
        x.add(3);
        conjunto.addAll(x);
        System.out.println(conjunto);
        //intercection of two collections 
        HashSet y = new HashSet();
        y.add(1);
        conjunto.retainAll(y);
        System.out.println(y);
        //to clear the collection 
        conjunto.clear();
    }

}
