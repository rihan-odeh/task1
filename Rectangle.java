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
public class Rectangle extends Shape { //inherits from shape
  //variables
    private Point p1,p2; //composition od Point object
   private int length =0;
   private int width =0; 
   private Point center; 
  
   
   public Rectangle(){  //the class rectangle should have no- argument constructor in order to enable square class to inherit from it. 
       p1=new Point (1,1);
       p2= new Point(1, 0);
   }
   
    public Rectangle(Point p1, Point p2){ 
        this.p1 = new Point(p1.getX(),p1.getY());
         this.p2 = new Point(p2.getX(),p2.getY());
    }
    public int findLength(){  //method to find the length of the rectangle
        int l = p1.getX()-p2.getX();
         return length = Math.abs(l);
    }
    public int findWidth(){ // method to find the width to help calculate area and parameter
        int w = p1.getY()- p2.getY();
        return width = Math.abs(w);
        
    }
    public double getArea(){ // implemintation of abstract methods in Shape class
    return findLength() *findWidth();    
    }
    public double getCircuference(){
        return 2*(findLength()+ findWidth()); 
    }
    public String getCenter(){
        
     int x = ((p1.getX()+ p2.getX())/2);
     int y= ((p1.getY()+p2.getY())/2) ;   //use thegiven corners to find the center
     center = new Point(x,y);
     return center.toString();
    } 
    public String toString(){
        return "The rectangle has a length of : " + findLength() + "  ,a width of " + findWidth() + " , its area = "+ getArea() 
                + " parameter of " + getCircuference() + " and the center of it is on " + getCenter();
    }
    
  
}
