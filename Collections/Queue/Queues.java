package Collections.Queue;
//to make the first declare you musto to import this 
import java.util.Queue;
import java.util.LinkedList;

public class Queues  {
    public static void main(String[] args) {
        //how to declare a queue 
        Queue <Integer> queue= new LinkedList<>();
        LinkedList<Integer> queue2 = new LinkedList<>();
        //adding using both methods
        queue.add(1);
        queue2.offer(1);
        //getting the head element in a queue
        //this first return an exeption when the queue has empty  and the second returns null
        queue.element();
        queue.peek();
        //removing the head element the firts return an exeption when the queue has empty  and the second returns null
        queue.remove();
        queue2.poll();

        queue.add(2);
        queue.add(3);
        queue.add(4);
        while(queue.peek()!=null){  
            System.out.println(queue.remove());
        }
    }
}
