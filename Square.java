/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author ro1
 */
public class Square extends Rectangle{  // square is a rectangle if length equals width
    private Point p1, p2; 
    private int side; 
    
    public Square (){
        p1= new Point (0, 1);
        p2= new Point(1, 0);
        side = 1; 
        
    }
    public Square (int x1,int x2,int y1,int y2, int side){
        p1 = new Point (x1,y1);
        p2 = new Point (x2,y2); 
        this.side= side; 
    }
    
    public int getSide(){
        side=  p1.getX()-p2.getX();
        return Math.abs(side);
    }
      public double getArea(){
          return getSide()*getSide();
      }
      public double getCircuference(){
          return getSide()*4;
      }
     public String getCenter(){
         return super.getCenter();
     }
      public String toString(){
        return "The square is a side of : " + getSide() + " , its area = "+ getArea() 
                + " parameter of " + getCircuference() + " and the center of it is on " + getCenter();
    }
}
