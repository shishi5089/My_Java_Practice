
package myqueue;
import java.util.*;


public class myDeque {
    
    public static void main(String[]args){
    Deque<String> d_q = new LinkedList<String>();
    
    d_q.add("Entering 3(Tail)"); //adding elementg to tail
    //Adds an element to the tail and returns a boolean to explain if the insertion was successful.
    d_q.offer("Entering 4");
    //Adds an element to the head and returns a boolean to explain if the insertion was successful.
    d_q.offerFirst("Entering 5");
    //Adds an element to the tail and returns a boolean to explain if the insertion was successful.
    d_q.offerLast("Entering 6");
    //Retrieves and removes the head of the queue represented by this deque
    //(in other words, the first element of this deque), or returns null if this deque is empty.
    d_q.poll();
    d_q.offer("Element 7 (Tail)"); 
    d_q.offerFirst("Element 8 (Head)"); 
    d_q.offerLast("Element 9 (Tail)");
    
    System.out.println("The elements in the deque are: \t"+d_q);
    
    }
}
