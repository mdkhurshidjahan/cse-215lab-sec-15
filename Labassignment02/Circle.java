
package Labassignment02;



public class Circle {
    //instsnce variable
    private double radius;
    //constructor
    Circle(double radius) {
        this.radius = radius;
    }
    //metod get radious
    public double getCircle() {
        return radius;
    }
 //metod  set radious
    public void setCircle(double radius) {
        this.radius = radius;
    }
     //metod getting circumfarance
    public double cirCumference(Circle ob){
        return 2 * ob.radius * Math.PI;
    }
     //metod  Area
    public double cirArea(Circle ob){
        return ob.radius * ob.radius * Math.PI;
    }
    
    @Override
    public String toString(){
        return "Radious : "+radius;
    }
}
