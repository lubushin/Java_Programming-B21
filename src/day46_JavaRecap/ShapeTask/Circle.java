package day46_JavaRecap.ShapeTask;

public class Circle extends Shape{
    public final static double PI = 3.14;//for internal use only
    public double r, d;

    public Circle(double r) {
        super("Circle");//set the name of the shape

        if(r<=0){
           throw new RuntimeException("No Such a Circle with a radius of: "+r);
        }

        setR(r);//this.r = r; same initializing
        setD(r*2);// d= r*2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return d * PI;
    }
}
