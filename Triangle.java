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
public class Triangle extends Shape{  //inherits from Shape
  private Point v1,v2,v3; //declare 3 Point objects, creaction for instance variables
  private double l1, l2,l3;
  private Point Center;
  
  public Triangle(int x1, int x2,int x3, int y1,int y2, int y3){   //constructor to assign the values
  v1= new Point (x1,y1);
  v2= new Point (x2,y2);
  v3= new Point (x3,y3);
  
  }
  public Triangle (Point p1,Point p2,Point p3){
     v1 = new Point(p1.getX(), p1.getY());
     v2 = new Point(p2.getX(), p2.getY());
     v3 = new Point(p3.getX(), p3.getY());
     
     
  }
  public String toString(){
     return " Triangle[v1="+v1.toString()+",v2="+v2.toString()+",v3="+v3.toString()+"].";
  }
  public double findL1(){
     return l1= v1.distance(v2);
       
  }
  public double findL2(){
     return  l2= v1.distance(v3);
      
  }
  public double findL3(){
   return l3= v2.distance(v3);  
  }
    
  //abstract methods implemented
    public double getCircuference(){  // the same as getParameter
       
        return l1+l2+l3;
    }
    public double getArea(){
        double s = getCircuference()/2;
        return  Math.sqrt(s*(s-findL1())*(s-findL2())*(s-findL3()));
    }
    public String getCenter(){
        int X = ((v1.getX()+ v2.getX()+v3.getX()) /3); 
        int Y = ((v1.getY()+ v2.getY()+v3.getY())/3);
       Center= new Point (X, Y);
        return Center.toString();
    }
    public void printType(){ // method to check the type of the triangle
    l1= v1.distance(v2);
    l2= v1.distance(v3);
    l3= v2.distance(v3);  
    if(l1 == l2 && l1==l3 && l2==l3)
        System.out.println("Equilateral");
    if(l1 == l2 || l1==l3 || l2==l3)
        System.out.println("Isosceles");
    else 
       System.out.println("Scalene"); 
        
    }
}
