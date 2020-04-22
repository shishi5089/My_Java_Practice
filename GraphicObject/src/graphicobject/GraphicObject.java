
package graphicobject;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;
import java.util.EmptyStackException;
import graphicobject.*;


public class GraphicObject extends JPanel {

    private String shape;
    
    public GraphicObject(String shape) {
        super();
        this.shape = shape;
    }
    
    
    @Override
    public void paintComponent(Graphics g){
       setBackground(Color.WHITE);
       
       if (this.shape.toLowerCase() == "rectangle") {
           g.setColor(Color.LIGHT_GRAY);
            g.drawRect(130,120,70,40);
            g.fillRect(130,120,70,40);
            g.translate(150, 150);
       }else if (this.shape.toLowerCase() == "oval") {
           g.setColor(Color.YELLOW);        //setting color
       g.drawOval(130, 130, 50, 60);    //drawing oval
       g.fillOval(130, 130, 50, 60);    //filling the oval
       g.translate(80, 30); 
       }
      
                  //translating position of oval
       
       else if(this.shape.toLowerCase()== "rounded rectangle"){
           g.setColor(Color.LIGHT_GRAY);
            g.drawRect(130,120,70,40);
            g.fillRect(130,120,70,40);
            g.translate(150, 150);
       
       g.setColor(Color.MAGENTA);
       g.drawRoundRect(130, 110, 70, 60, 50, 40);
       g.fillRoundRect(130, 110, 70, 60, 50, 40);
       
       }
       else if(this.shape.toLowerCase()== "polygon1"){
           g.setColor(Color.pink);
       int x[] = { 10, 30, 40, 50, 110, 140 };
       int y[] = { 140, 110, 50, 40, 30, 10 };
       int numberofpoints = 6;
       Polygon p = new Polygon(x,y,numberofpoints);
       g.drawPolygon(p);
       g.fillPolygon(p);
       g.translate(230, 120);
       }

            
       
       
       else if(this.shape.toLowerCase()== "polygon2"){
        g.setColor(Color.cyan);
       int x1[] = {20,10,40,60,50};
       int y1[] = {40,30,20,60,90};
       int nop  = 5;
       Polygon p1 = new Polygon(x1,y1,nop);
       g.drawPolygon(p1);
       g.fillPolygon(p1);
       g.translate(240, 120);
     
       }
       
    
    }

   
  
    
}
