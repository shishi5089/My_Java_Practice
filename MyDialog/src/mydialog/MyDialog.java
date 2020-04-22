
package mydialog;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyDialog extends JFrame implements ActionListener{
    static JFrame f;
    
    public static void main(String[] args) {
        //create a frame
        f = new JFrame("My frame");
        //create a object
        MyDialog d = new MyDialog();
        //create a panel
        JPanel p = new JPanel();
        JButton b = new JButton("Click me");
        
        b.addActionListener(d);
        //add button to panel
        p.add(b);
        //add panel to frame
        f.add(p);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String d  = e.getActionCommand();
       
       if(d.equals("Click me")){
           //create a dialog box
           JDialog r = new JDialog(f, "My dialog box");
           //create a label
           JLabel l = new JLabel("This is my dialog box");
           //add label to dialog box
           r.add(l);
           //set size of dialog box
           r.setSize(400,400);
           //set visibility
           r.setVisible(true);
       }
    }
    
}
