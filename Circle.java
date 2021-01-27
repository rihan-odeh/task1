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
public class Circle extends Shape { //inherits shape
 // instance variables.
    private Point center; //composition; create an instance object of point class

private  double area;
private int raduis; 

public Circle(int x, int y, int r) {  // cinstructor assigns values.
this.center= new Point (x,y); //must initialize to avoid allyazing. 
raduis=r;}
public Circle (Point p, int raduis){
this.center = new Point(p.getX(),p.getY()); 
this.raduis =raduis;
}
public Circle(){
this.center= new Point(); //no argument constructor in point class
raduis =1; 
}
//getters:
public Point getcenter(){ 
return this.center; 
}
public int getRaduis(){
return raduis; }

public int getXCor(){
return center.getX();}

public int getYCor(){
return center.getY();}

//setters:
public void setCenter(Point p){
center =new Point(p.getX(), p.getY());}

public void setCenter(int x,int y){
center = new Point(x,y);}

public void setRaduis(int raduis){
this.raduis = raduis; }

public String toString(){
return "Circle[radius="+ raduis +",center="+ center.toString()+"]";
}
public double distance(Circle another){ //calculate distance 
return center.distance(another.center);
}
public  double getArea(){ //implement abstract methods
    area= raduis*raduis*Math.PI; 
    return area;
}
public double getCircuference(){
return raduis*2* Math.PI;


}
public String getCenter(){
return this.center.toString(); 
}
//to calculate the distance from the parameter
public double Distance(Circle c){
    double distance = center.distance(c.center);
    return distance -(this.getRaduis() + c.getRaduis());
    
    
}
public boolean ifIntersect(Circle c){
if (Distance(c)<=0)
    return true;
   return false;  
}








}
