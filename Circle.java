
public class Circle {
private double radius=1.0;
private String color ="RED";
static final double PI=3.14;
public Circle(){
}
public Circle(double radius){
	this.radius=radius;
	
}
public double getRadius(){
	return radius;
}
public double getArea(){
return PI*radius*radius;
}
public String toString(){
	return String.format("%s: %.2f\n%s: %.2f\n%s: %s","radius is",getRadius(),"area is",getArea(),"color is",color);
}
}
