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
public class Point {
    private int x , y; //instance variables
    
public Point(){  //no argument constructor that assigns zero values to the point's coordinates.
x= 0;
y=0; }
public Point (int x,int y){   //assign the given values to the point. 
this.x = x; 
this.y= y; 
}
public int getX(){  //getters
return x;}
public int getY(){
return y;}
public int[] getXY(){   //getter that returns the values of x and y in an array.
int [] array = new int[2];
array[0]= x; 
array[1]=y;
return array;}
public void setX(int x){ //setters
this.x= x;
}
public void setY(int y){
this.y=y; }

public void setXY(int x,int y){
this.x =x; 
this.y= y;}

public String toString(){    // method to return the coordinate as a point set. 
String s= "(" +x +"," + y+ ")";
return s;}
public double distance(int x, int y){  // methods to find the distance between the point and other point given its coordinates
return Math.sqrt((this.x - x )*(this.x - x ))+ ((this.y-y)*(this.y-y)); // using the mathmetical formula and methods in java/Math library 
}
public double distance( Point another){
return Math.sqrt(Math.abs(this.x - another.x )*Math.abs(this.x - another.x ) + Math.abs(this.y-another.y)*(Math.abs(this.y-another.y)));
}
public double distance(){
return Math.sqrt(x*x+ y*y);
}
}
