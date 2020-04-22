
package stackimplementation1;
import java.util.*;


public class StackImplementation1 {
    private int array[];
    private int top;
    private int capacity;
    
    StackImplementation1(int size){
        array = new int[size];
        capacity = size;
        top  = -1;
    }

  public void push(int x){
      if (isFull()){
          System.out.println("Stack Overflow\n");
          System.exit(1);
          
      }
      System.out.println("Inserting "+x);
      array[++top] = x;
  }  
  
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow\n");
            System.exit(1);
                        
        }
        System.out.println("Removing "+peek());
         return array[--top];
    }
    public int peek(){
        if (!isEmpty()){
        return array[top];
    }else{
        System.out.println("Stack Underflow\n");
        System.exit(1);
        }
        return -1;
    }  
    public int size(){
        return top + 1;
    }
    
    public boolean isFull(){
        return size() == capacity;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
        
    public static void main(String[] args) {
        StackImplementation1 stack = new StackImplementation1(4);
        
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(5);
        
        stack.pop();
        stack.pop();
        
        System.out.println("The size of the stack is "+ stack.size());
        System.out.println("The value at the top of the stack is "+ stack.peek());
        
        if (stack.isEmpty()){
            System.out.println("The stack is empty");
        }else {
            System.out.println("The stack is not empty");
        }
    }
    
}
