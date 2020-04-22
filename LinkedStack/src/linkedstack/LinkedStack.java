
package linkedstack;
import java.util.*;
public class LinkedStack {
    //create node
    private class Node{
        //Node stores data and next link
        int data;
        Node next;
        //constructor for node that takes data as parameter
        public Node(int data){
        this.data = data;
    }
        
    }
    private Node head;
    private int size;
    
    //constructor
    public LinkedStack(){
        size = 0;
        head = null;
        
    }
    public int size(){
        return size;
        
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void push(int data){
        Node newNode  = new Node(data);
        
        if(head == null){
            //if list is empty, create first node
            head = newNode;
        }
        else{
            //take the value in head and place it in next node
            newNode.next = head;
            //make the  new node to be the head
            //Insertion
            head = newNode;
        }
        size++;
        
    }
    public int pop(){
        //check if empty
        if(head == null){
            System.out.println("Stack is empty");
        }
        //create node to hold value in head
        Node n = head;
        //make the next node to be head
        head = head.next;
        //reduce size due to pop
        size--;
        //return value stored in popped node
         return n.data;
         
    }
    public int peek(){
        if(head == null){
            System.out.println("Stack is empty");
        } 
        return head.data;
    }

    
    public static void main(String[] args) {
        LinkedStack stk = new LinkedStack();
        stk.push(3);
        stk.push(4);
        stk.push(5);
        
        System.out.println("Expected size is 3. Actual size is: "+ stk.size());
        Integer i = (Integer)stk.pop();
        System.out.println("Popped value: "+i);
        
        
    }
    
}
