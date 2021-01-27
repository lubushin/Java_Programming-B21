package day44_Inheritance.ShapeTasks;

public class Square extends Shape{
    /*variables: 4(1 instance, 3 static)
    methods: 4(4 instance methods)*/

    public double side;

    public Square(double side){
        super("Square");
        this.side = side;

    }

    public double calcArea(){
        return side*side;
    }
    public double calcPerimeter(){
        return side*4;
    }

}
