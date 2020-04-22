package mystacklist;


import mystacklist.Stack.StackFullException;
import mystacklist.Stack;
import java.util.*; 

public class ArrayStack implements Stack,LinkedList {
    
    public class Node{
        Object obj;
        Node next;
        
        public Node(Object obj, Node next){
            this.obj = obj;
            this.next = next;
        }
    }
    
    private LinkedList<Node> list;
    private Node top;
    public int size;
    public static final int CAPACITY = 1000;
   // private int top = -1;
    private int capacity;
    //private Object S[];

    public ArrayStack() {
        this(CAPACITY);
        this.top = null;
        this.size = 0;
    }

    public ArrayStack(int cap) {
        capacity = cap;
      //  S = new Object[capacity];
    }
    @Override
    public Object pop() throws StackEmptyException {
        //Object elem;

        if (list.isEmpty()) {
            throw new StackEmptyException("Stack is empty");

        }
        Node n = list.getFirst();
        //head = head.next;
        list.remove(0);
        size--;
        //elem = S[top];
        //S[top--] = null;

        return n;
    }

    @Override
    public void push(Object obj) throws StackFullException {
        
        if (size == capacity) {
            throw new StackFullException("Stack Overflow");
        }
        else if(size == 0){
        Node newNode = new Node(obj,null);
        newNode.obj = obj;
        newNode.next = top;
        top = newNode;
        list.addFirst(newNode);
        size++;
        }
        else{
            Node newNode1 = new Node(obj, list.getFirst());
            list.addFirst(newNode1);
            size++;
                    
        }
       // S[++top] = obj;
//       if(head == null){
//           head = newNode;
//       }else{
//           newNode.next = head;
//           head = newNode;
//       }
       //size++;
    }

    @Override
    public int size() {
        //return top + 1;
        return size;
    }

    @Override
    public Object top() throws StackEmptyException {
        if (list.isEmpty()) {
            throw new StackEmptyException("Stack is Empty");
        }
        
        return list.getFirst();

         
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
   
}
