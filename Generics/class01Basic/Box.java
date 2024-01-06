//applying the generic type t por this class
public class Box<T> {
    //Now the type that you pass when you initialize a varivael for type box
    //will be applyed in all the place that you put the T  
    private T thing;
    public void saveThing(T thing) {
        this.thing = thing;
    }
    public T openThing() {
        return thing;
    }
}
