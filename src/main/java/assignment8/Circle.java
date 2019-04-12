package assignment8;

public class Circle implements Shape {

    @Override
    public void area(int length, int breadth) {

    }

    @Override
    public void area(int radius) {
    System.out.println("area of circle is "+ 3.14*radius*radius);
    }
}
