package day47_Abstraction.Shape;

public abstract class Shape {//generic, NOT concrete - Physically exist
    public String name;

    public Shape(String name) {
        this.name = name;
    }
  public abstract double area();
  public abstract double perimeter();




}
