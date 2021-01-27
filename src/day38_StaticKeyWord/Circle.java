package day38_StaticKeyWord;

import java.text.DecimalFormat;

public class Circle {

  public double radius, diameter, area, perimeter;

  public void setInfo(double radius){
     this.radius = radius;
     diameter = 2* radius;
     area = calculatedArea();
     perimeter = calculatedPerimeter();
  }

public double calculatedArea(){
    return radius * radius * Math.PI;
}

public double calculatedPerimeter(){
    return diameter * Math.PI;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "day41_Encapsulation.Circle.Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area )  +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }

    public boolean equals(Circle circle){
      return this.radius == circle.radius;

    }

}
/*
1. create a custom class called day41_Encapsulation.Circle.Circle
                Attributes:
                    radius, diameter, area, perimeter
                methods:
                    caculateArea: returs the area of the circle
                    calculatePerimeter: returns the perimeter of the circle
                    setInfo: initializes all the instance of the day41_Encapsulation.Circle.Circle
                    toString methods*/
