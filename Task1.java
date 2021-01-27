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
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //tester, driving
        // TODO code application logic here
      Shape shape; 
      Point p1 = new Point (1,3); 
      Point p2 = new Point (2,2); 
      Point p3 = new Point (4,6); 
      
      System.out.println("The distance between the first point"+ p1.toString()+ " and the third point" + p3.toString()+ " is = " + p1.distance(p3));
      System.out.println("The distance between "+ p2.toString() +" and the origin is = "+p2.distance());
      
      Circle c = new Circle(); 
      Triangle t= new Triangle(p1,p2,p3); 
      Rectangle r= new Rectangle(p1,p2); 
      Square s = new Square();
      Circle c1 = new Circle(4,0,1);
      Circle c2 = new Circle(3,0,1);
      shape = c; 
     System.out.println("The area of the circle is = "+c.getArea());
     System.out.println("The circuference of the circle is = "+c.getCircuference());
      System.out.println(shape.toString());
      System.out.println("The distance between a circle"+c.Distance(c1));
      System.out.println("Check if these two circles are intersected or touch:" + c.ifIntersect(c2));
      shape = t;
      t.printType();
      System.out.println(shape.toString());
      System.out.println("The triangle has a center in : "+ t.getCenter());
      
      shape= r;
      System.out.println(shape.toString());
    
      
      shape = s;
      
      System.out.println(shape.toString());
       String[] array = new String[4]; 
       array[0]= "Circle"; 
       array[1]= "Triangle"; 
       array[2]= "Rectangle"; 
       array[3]= "Square";
       System.out.println("The list of shapes is:");
       for(int i=0; i<4; i++)
           System.out.println(array[i]);
    }
    
}
