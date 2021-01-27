package day44_Inheritance.ShapeTasks;

public class Circle extends Shape {
   /*
   variables: 4(1 instance, 3 static)
   methods: 4(4 instance methods)
    */

    public double radius, diameter;
    public final static double PI;
    static{
        PI = Math.PI;
    }

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
        diameter = radius*2;
    }
    public double calcArea(){
        return radius*radius *PI;
    }
    public double calcPerimeter(){
        return diameter * PI;
    }

}
