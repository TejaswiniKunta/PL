package assignment8;

 public  class Rectangle implements Shape {


    public void area(int length, int breadth) {
        System.out.println("area of rectangle is "+length*breadth);
    }

     @Override
     public void area(int radius) {

     }
 }
