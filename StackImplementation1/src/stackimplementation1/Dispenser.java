
package stackimplementation1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.EmptyStackException;
import java.awt.geom.*;
import java.util.Stack;


public class Dispenser extends JFrame {
    Stack<Shape> stk;
    JPanel controls,stackContents;
    JButton push,pop,peek,size;
    String[]possibilities = {"Circle","Square"};
    
    public Dispenser(){
        stk = new Stack<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controls = new JPanel(new BoxLayout(controls,BoxLayout.PAGE_AXIS));
        stackContents = new JPanel(new BoxLayout(stackContents,BoxLayout.PAGE_AXIS));
        push = new JButton("Push");
        pop = new JButton("Pop");
        size = new JButton("Size");
        peek = new JButton("peek");
        
        push.addActionListener(new ActionListener() {
       // @Override
        public void actionPerformed(ActionEvent evt){
            String S =(String) JOptionPane.showInputDialog(null,"Choose shape to add ","Push",JOptionPane.PLAIN_MESSAGE,null,possibilities,
                    possibilities[0]);
                //try{
                    if(S == "Circle"){
                        stk.push(new Ellipse2D.Float(100.0f,100.0f,100.0f,100.0f));
                    }
                //}
               // catch(StackFullException e){
               //         JOptionPane.showMessageDialog(null,"The dispenser is full");
               //         }
           // }
                }
        
            }
        );
        //Add click listeners tto other buttons
        controls.add(push);
        controls.add(pop);
        controls.add(peek);
        controls.add(size);
        
        add(controls,BorderLayout.EAST);
        add(stackContents,BorderLayout.WEST);
        pack();
        setVisible(true);
        
        
}
    public static void main(String[]args){
        new Dispenser();
    }
    
}
