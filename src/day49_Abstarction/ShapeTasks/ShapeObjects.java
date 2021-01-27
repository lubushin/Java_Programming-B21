package day49_Abstarction.ShapeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(10,20);
        Cube cube = new Cube(15);
        Cylinder cylinder = new Cylinder(2,5);
        Square square = new Square(7);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(square);

        System.out.println(circle.getRadius());
        //System.out.println(rectangle.getWidth());

        System.out.println("====================================");

        Shape[] shapes = {circle,rectangle,cube,cylinder, new Circle(5), new Rectangle(3,8)};

        for( Shape eachShape: shapes){
            if(eachShape.name.equals("Circle")){
                System.out.println(eachShape);
            }
        }
        System.out.println("===============================================");
        ArrayList<Shape> circles = new ArrayList<>();
        circles.addAll(Arrays.asList(shapes));

        circles.removeIf(p-> !p.name.equals("Circle"));
        System.out.println(circles.size());

        System.out.println("==================================");
        circles.forEach(p->{      System.out.println(p);});


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
      list.forEach(p-> {if(p % 2 ==0) p*=2; System.out.print(p+" "); });
        System.out.println(list);

        System.out.println("====================================");
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> greaterThan5 = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
            numbers.forEach(p->{if(p%2 ==0) evenNumbers.add(p);else oddNumbers.add(p);});
        numbers.forEach(p-> {if(p>5)greaterThan5.add(p);});
            
            System.out.println("Odd numbers: "+oddNumbers);
        System.out.println("Even Numbers: "+evenNumbers);
        System.out.println("Greater than 5: "+greaterThan5);
    }
}
