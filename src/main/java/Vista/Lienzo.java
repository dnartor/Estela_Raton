package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;


public class Lienzo extends JPanel{
   private String color="Rojo";
   private ArrayList<Point2D> points = new ArrayList<>();
  
   public void setPoint(int p1,int p2){
       points.add(new Point(p1,p2));
       if ( points.size()>5) points.remove(0);
   }
   public void setColor(String color){
       this.color=color;
   }
   
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        switch (color){
            case "Rojo":
                 g.setColor(Color.red);
            break;
            case "Blanco":
                 g.setColor(Color.white);
            break;
            case "Verde":
                g.setColor(Color.green);
            break;
            case "Azul":
                 g.setColor(Color.blue);
        } 
        
        for(int i = 0;i<points.size();i++){
            g.fillOval((int)points.get(i).getX(),(int)points.get(i).getY(),10, 10);
        }
    }
    
    public Graphics gafica(){
        return this.getGraphics();
    }
}
