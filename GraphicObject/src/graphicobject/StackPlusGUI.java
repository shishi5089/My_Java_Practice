
package graphicobject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.Stack;
import graphicobject.*;
import java.util.Random;



public class StackPlusGUI extends JFrame {
//    JPanel controls,stackContents;
//    static JButton push, pop,size,peek,empty;
//    MyStack stack;
//    static JFrame frame;
//    
//    public StackPlusGUI(){
//        //initializing the variables
//        //mystack = new Stack<>();
//        stack = new MyStack(10);
//        setLayout(new FlowLayout(FlowLayout.RIGHT));
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(new Dimension(500,500));
//        setTitle("My Stack Frame");
//        
//        stackContents = new JPanel();
//	stackContents.setLayout(new GridLayout(1, 2));
//	stackContents.setSize(new Dimension(500, 500));
//        controls = new JPanel(new BoxLayout(controls,BoxLayout.PAGE_AXIS));
//        push = new JButton("Push");
//        pop = new JButton("Pop");
//        peek = new JButton("Peek");
//        size = new JButton("Size");
//        empty = new JButton("Empty");
//        setContentPane(stackContents);
//        
//    }
//     public static void main(String[] args) {
//    //create an object of class JFrame
//    StackPlusGUI sg = new StackPlusGUI();
//    frame = new JFrame("My Stack Frame");
//    frame.getContentPane().setLayout(new FlowLayout());
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.pack();
//    frame.setVisible(true);
//    JPanel controls = new JPanel();
//    JPanel stackContents = new JPanel();
////    JButton push = new JButton("Push");
////    JButton pop = new JButton("Pop");
////    JButton peek = new JButton("Peek");
////    JButton size = new JButton("Size");
////    JButton empty = new JButton("Empty");
//    
////    push.setActionCommand("Push");
////    empty.setActionCommand("Empty");
////    pop.setActionCommand("Pop");
////    peek.setActionCommand("Top");
////    size.setActionCommand("Size");
//    
//        
//    
//    
//   push.addActionListener(sg);
//   pop.addActionListener(sg);
//   peek.addActionListener(sg);
//   size.addActionListener(sg);
//   empty.addActionListener(sg);
//    
//    controls.add(push);
//    controls.add(pop);
//    controls.add(peek);
//    controls.add(size);
//    controls.add(empty);
//    
//    frame.add(controls,BorderLayout.EAST);
//    frame.add(stackContents,BorderLayout.WEST);
//    
//    
//    
//    
//    
//        
//    }
//   
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String push1 = e.getActionCommand();
//        String pop1 = e.getActionCommand();
//        String peek1 = e.getActionCommand();
//        String empty1 = e.getActionCommand();
//        String size1 = e.getActionCommand();
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        if(push1.equals("Push")){
//            try{
//                String array[] = new String[]{"rectangle", "oval", "rounded rectangle", "polygon1", "polygon2"};
//                 //generate random number to represent string object 
//                Random rand = new Random();
//                 //random number to represent 5 objects range from 0-6
//                int x = rand.nextInt(6);
//                //pass canvas as one of the string objects to represent the object being pushed to the stack
//                GraphicObject canvas = new GraphicObject(array[x]); 
//                 //push graphic object to stack
//                stack.push(canvas);
//                stackContents.add(canvas, 0);
//                stackContents.revalidate();
//                stackContents.repaint();
//            }
//            catch(Exception ea){
//                JOptionPane.showMessageDialog(null,ea.getMessage(),"Error: Stack is full",0);  
//            }
//        }
//            if (pop1.equals("Pop")){
//                try{
//                    //remove object from stack
//                    GraphicObject g = stack.pop();
//                    //display object being popped
//                        JDialog r = new JDialog(frame, "POP");
//                        // JLabel l = new JLabel(String.valueOf(stack.size()));
//                        r.add(g);
//                        r.setSize(400,400);
//                        //set visibility
//                        r.setVisible(true);
//                }
//                catch(Exception ea){
//                    
//                    JOptionPane.showMessageDialog(null,ea.getMessage(),"Error:Stack is empty",0);
//                }
//            }
//                if(peek1.equals("Peek")){
//                    try{
//                        GraphicObject g = stack.peek();
//                        JDialog r = new JDialog(frame, "TOP");
//                        // JLabel l = new JLabel(String.valueOf(stack.size()));
//                        r.add(g);
//                        r.setSize(400,400);
//                        //set visibility
//                        r.setVisible(true);
//                    }
//                    catch(Exception ea){
//                        
//                         JOptionPane.showMessageDialog(null,ea.getMessage(),"Error",0);
//                    }
//                    
//                }
//                    if(size1.equals("Size")){
//                        JDialog r = new JDialog(frame, "Size");
//                        JLabel l = new JLabel(String.valueOf(stack.size()));
//                        r.add(l);
//                        r.setSize(400,400);
//                        //set visibility
//                        r.setVisible(true);
//                            
//                        
//                        
//                    }
//                    if(empty1.equals("Empty")){
//                        stack.empty();
//                    }
//    }
    JPanel contentPane, dispenser, controls;
	JLabel label;
	JButton push, pop, peek, size, isEmpty;
	JFrame frm;
        MyStack stack;
    public StackPlusGUI(){
                stack = new MyStack(10);
                setLayout(new FlowLayout(FlowLayout.RIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(500,500));
		setTitle("My Stack GUI");

		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(1, 2));
		contentPane.setSize(new Dimension(500, 500));

		setContentPane(contentPane);

		dispenser = new JPanel();
		dispenser.setLayout(new BoxLayout(dispenser, BoxLayout.PAGE_AXIS));
		dispenser.setSize(new Dimension(300, 500));
		dispenser.setBackground(Color.WHITE);

		controls = new JPanel();
		controls.setLayout(new BoxLayout(controls, BoxLayout.PAGE_AXIS));
		controls.setSize(new Dimension(200, 500));
		controls.setBackground(Color.magenta);

		frm = new JFrame();

		push = new JButton("PUSH");
		pop = new JButton("POP");
		peek = new JButton("PEEK");
		size = new JButton("SIZE");
		isEmpty = new JButton("ISEMPTY");

		push.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt){
				addToStack();
			}
		});

		pop.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				try{
                                    if (stack.size() == 0) {
                                        dispenser = new JPanel();
                                        dispenser.setLayout(new BoxLayout(dispenser, BoxLayout.PAGE_AXIS));
                                        dispenser.setSize(new Dimension(300, 500));
                                        dispenser.setBackground(Color.WHITE);
                                   }
                                    GraphicObject g = stack.pop();
                                    //display object being popped
                                        JDialog r = new JDialog(frm, "POP");
                                        // JLabel l = new JLabel(String.valueOf(stack.size()));
                                        r.add(g);
                                        r.setSize(400,400);
                                        //set visibility
                                        r.setVisible(true);
					dispenser.remove(stack.pop());
					dispenser.revalidate();
					dispenser.repaint();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frm, "The dispenser is empty");
				}
			}
	});

		peek.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				try{
                                    GraphicObject g = stack.peek();
                                    JDialog r = new JDialog(frm, "TOP");
                                    // JLabel l = new JLabel(String.valueOf(stack.size()));
                                    r.add(g);
                                    r.setSize(400,400);
                                    //set visibility
                                    r.setVisible(true);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frm, "The dispenser is empty");
				}
			}
		});

		size.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent evt)
			{
				JOptionPane.showMessageDialog(frm, "The number of elements in the stack is " + stack.size());
			}
		});

		isEmpty.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				JOptionPane.showMessageDialog(frm, "" + String.valueOf(stack.isEmpty()));
			}
		});

		controls.add(push);
		controls.add(Box.createRigidArea(new Dimension(0, 15)));
		controls.add(pop);
		controls.add(Box.createRigidArea(new Dimension(0, 15)));
		controls.add(peek);
		controls.add(Box.createRigidArea(new Dimension(0, 15)));
		controls.add(size);
                controls.add(Box.createRigidArea(new Dimension(0, 15)));
                controls.add(isEmpty);
                

		//label = new JLabel(String.valueOf(stack.size()));

		contentPane.add(dispenser);
		contentPane.add(controls);

		setVisible(true);
	}

	private void addToStack(){
		try{
                String array[] = new String[]{"rectangle", "oval", "rounded rectangle", "polygon1", "polygon2"};
//                 //generate random number to represent string object 
                Random rand = new Random();
//                 //random number to represent 5 objects range from 0-6
                int x = rand.nextInt(6);
//                //pass canvas as one of the string objects to represent the object being pushed to the stack
                GraphicObject canvas = new GraphicObject(array[x]);
//                //pass canvas as one of the string objects to represent the object being pushed to the stack
//                 //push graphic object to stack
                stack.push(canvas);
                
                dispenser.add(canvas);
                // dispenser.add(Box.createRigidArea(new Dimension(0, 15)));
                dispenser.revalidate();
		dispenser.repaint();
		} catch (Exception e ) {
			JOptionPane.showMessageDialog(frm, "The stack"
                                + " is full!" + e.getMessage());
		}
	}

	public static void main(String []args)
	{
		StackPlusGUI s =new StackPlusGUI();		
	}
}
