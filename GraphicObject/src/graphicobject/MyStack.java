
package graphicobject;
import java.awt.Graphics;
import java.util.Arrays;




public class MyStack {
//    public class Node{
//         GraphicObject data;
//         Node next;
//         
//         public Node(){
//             this.data = data;
//         }
//    }
//    private Node head;
    private int size = 0;
    private GraphicObject elements[];
    private int index;
    private int capacity;
    
    public MyStack(int capacity){
        this.capacity = capacity;
        elements = new GraphicObject[capacity]; //elements array holds maximum number of size elements
        index = -1;                 //sets value of top element
}
    
    public  void push(GraphicObject x){
           //Node myNode = new Node();
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
            return;
        }
//        if(head == null){
//            
//            head = myNode;
//            
//        }
//        else{
//            myNode.next = head;
//            head = myNode;
//        }
          System.out.println("Inserting "+ x);
          size++;
          index ++;
          elements[index] = x;
    }
   
    public GraphicObject pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
             System.exit(1);
        }
       
        
//        Node n = head;
//        head.next = head;
//        System.out.println("Removing " + peek());
        
        GraphicObject temp = elements[index];
        elements[index] = null;
        
        index--;
        size--;
        return temp;//n.data;
    }
    
    public GraphicObject peek(){
        if(isEmpty()){
          System.out.println("Stack Underflow"); 
           
        }
        return elements[index];
    }
    
    public int size(){
        return size; 
    }
    public boolean isFull(){
        return capacity <= index + 1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void empty() {
        index = -1;
        size = 0;
    }
}
