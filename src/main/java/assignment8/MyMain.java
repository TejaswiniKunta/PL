package assignment8;

import assignment9.Div;
import assignment9.ExprAbstractClass;

public class MyMain {
    public static void main(String args[]) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.area(2,3);
//        Circle circle = new Circle();
//        circle.area(2);
       ExprAbstractClass addition = new Add (new Number(5),new Number(3));
     ExprAbstractClass subtraction = new Sub (new Number(4),new Number(2));
     ExprAbstractClass multiplication = new Mult (new Number(2),new Number(2));
     ExprAbstractClass division = new Div(new Number(1),new Number(8));
     System.out.println(addition.eval());
     System.out.println(subtraction.eval());
     System.out.println(multiplication.eval());
     System.out.println(division.eval());

//        String exp = "5+4*3/2-1";
//        System.out.println(exp);
//        String firstExp = exp.substring(0,exp.indexOf("*"));
//        String secondExp = exp.substring(exp.indexOf("*")+1);
//
//        int n1 =Integer.parseInt(firstExp.substring(0,firstExp.indexOf("+")));
//        int n2 = Integer.parseInt(firstExp.substring(firstExp.indexOf("+")+1));
//        int n3 = Integer.parseInt(secondExp.substring(0,secondExp.indexOf("/")));
//
//         int n4 = Integer.parseInt(secondExp.substring(secondExp.indexOf("/")+1,secondExp.indexOf("-")));
//         int n5  = Integer.parseInt(secondExp.substring(secondExp.indexOf("-")+1));
//        System.out.println("result="+expression1.eval(expression.eval(n1,expression2.eval(n2,expression3.eval(n3,n4))),n5));
    }
}
