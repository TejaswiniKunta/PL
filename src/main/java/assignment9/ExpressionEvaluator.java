package assignment9;

import java.util.Scanner;


/**
 * This class is responsible for taking the input and displaying the result of given expression
 */
public class ExpressionEvaluator {

    public static void main(String args[]) {
        System.out.println("enter an expression");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        System.out.println(expression);
        ExprEval exprEval = new ExprEval();
        System.out.println("final result="+exprEval.expressionEval(expression));

    }
}
