
package myqueue;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class MyQueue {

   
    public static void main(String[] args) {
        Queue<Integer> my_q = new LinkedList();
        
        //adding elements to the queue
        for(int i = 0; i < 10;  i++){
            my_q.add(i);
        }
        //printing my queue
        System.out.println("The values in my queue are: "+my_q);
        //to get the first element in the queue
        int top = my_q.poll();
        //removing an element in a queue
        int rem = my_q.remove();
        //getting the size of the queue
        int size  = my_q.size();
        
        System.out.println("The top value of my queue is "+ top + ". I have removed " + rem + " and now my queue size is "+size);
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
    
    //Standard iterator
    Iterator iterator = d_q.iterator();
    while(iterator.hasNext()){
        System.out.println("Here is \t" + iterator.next());
    }
    //Reverse order iterator
    Iterator reverse  = d_q.descendingIterator();
    
    while(reverse.hasNext()){
        System.out.println("\t"+ reverse.next());
    }
    
    System.out.println("Peek " +d_q.peek());
    
    System.out.println("Pop "+d_q.pop());
    System.out.println(" After pop "+d_q);
    
     System.out.println("Size "+d_q.size());
    
        
    }
    
}
