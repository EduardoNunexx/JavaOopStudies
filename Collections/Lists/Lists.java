package Collections.Lists;
import java.util.List;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        //How to declare
        ArrayList<User> list = new ArrayList<>();
        List<User> list2= new ArrayList<>();
        //adding new elements in the list
        //down below i make this new because in the construtor he wants an String for the name attribute
        list.add(new User("jao"));
        User u2 = new User("juin");
        list.add(u2);
        System.out.println(list.get(0));
        //removing an element using the equals and hashcode
        list.remove(u2);
        System.out.println(list);
    }
}
