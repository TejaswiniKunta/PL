package assignment9;

import assignment8.Number;

import java.util.Stack;

/**
 * This class extracts operators and adds to a stack and also extracts operands
 */
public class ExprEval {

     ExprAbstractClass exprAbstractClass;

    public String expressionEval(String exp) {
        Stack operators = operatorPresence(exp);
        while(!operators.isEmpty()) {
            exp = getValues(operators, exp);
            System.out.println("expression = "+exp);

        }
        return exp;
    }


    public Stack operatorPresence(String expression) {
        Stack stack = new Stack();
        for(char c: expression.toCharArray() ) {
        if (Character.toString(c).contains("/")) {
                stack.push("/");
            } else if (Character.toString(c).contains("*")) {
                stack.push("*");

            } else if (Character.toString(c).contains("-")) {
                stack.push("-");
            } else if (Character.toString(c).contains("+")) {
                stack.push("+");
            }
        }

       return stack;
    }

    private String getValues(Stack operators,String exp) {
        String expression = "";
        if (exp.contains("/")) {
            expression=division(operators, exp);

        } else if (exp.contains("*")) {
            expression = multiplication(operators, exp);

        }else if (exp.contains("-")) {
            expression =  subraction(operators, exp);
        }
        else if (exp.contains("+")) {
            expression = addition(operators, exp);
        }
        return expression;
    }


    private String division(Stack operators,String exp) {
       String e = "";
       String e2 = "";
        if(operators.indexOf("/")>0) {
            if(operators.indexOf("/") == operators.size()-1) {
                e = exp.substring(exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("/") - 1))) + 1,
                        exp.indexOf("/"));
                e2 = exp.substring(exp.indexOf("/") + 1);

//                String res = exprAbstractClass.div(Integer.parseInt(e), Integer.parseInt(e2));

                exprAbstractClass = new Div(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());
                exp = exp.substring(0,exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("/")-1)))+1) + res;
                operators.remove(operators.indexOf("/"));
            }

            else {
            e = exp.substring(exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("/") - 1))) + 1,
                    exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("/")))));

            e2 = exp.substring(exp.indexOf("/") + 1,
                    exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("/") + 1))));

                exprAbstractClass = new Div(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());
            e = exp.substring(0, exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("/") - 1))) + 1) + res;
            e2 = e + exp.substring(exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("/") + 1))));
            exp = e2;
                operators.remove(operators.indexOf("/"));

            }
        } else  {
                if(operators.size()==1) {

                    e= exp.substring(0,exp.indexOf("/"));
                    e2 = exp.substring(exp.indexOf("/")+1);
                    exprAbstractClass = new Div(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                    String res = Integer.toString(exprAbstractClass.eval());
                    exp = res;
                    operators.pop();
                }
                else {
                    e = exp.substring(0, exp.indexOf("/"));
                    e2 = exp.substring(e.length() + 1, exp.indexOf(String.valueOf(operators.elementAt(1))));
                    exprAbstractClass = new Div(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                    String res = Integer.toString(exprAbstractClass.eval());
                    e = exp.substring(exp.indexOf(String.valueOf(operators.elementAt(1))));
                    exp = res+ e;
                    operators.remove(operators.indexOf("/"));

                }
        }

       return exp;
    }

    private String multiplication(Stack operators,String exp) {
        String e = "";
        String e2 = "";
        if(operators.indexOf("*")>0) {
            if(operators.indexOf("*") == operators.size()-1) {
               e = exp.substring(exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("*")-1)))+1,
                    exp.indexOf("*"));
               e2 = exp.substring(exp.indexOf("*")+1);
                exprAbstractClass = new Mult(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());
                exp = exp.substring(0,exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("*")-1)))+1) + res;
                operators.remove(operators.indexOf("*"));

            } else {
                e = exp.substring(exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("*") - 1))) + 1,
                        exp.indexOf("*"));
                e2 = exp.substring(exp.indexOf("*")+1,
                        exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("*") + 1))));

                exprAbstractClass = new Mult(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());

                e = exp.substring(0, exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("*") - 1))) + 1) + res;
                e2 = e + exp.substring(exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("*") + 1))));
                exp = e2;
                operators.remove(operators.indexOf("*"));

            }

        } else  {
            if(operators.size()==1) {

                e= exp.substring(0,exp.indexOf("*"));
                e2 = exp.substring(exp.indexOf("*")+1);

                exprAbstractClass = new Mult(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());

                exp = res;
                operators.pop();
            }
            else {
                e = exp.substring(0, exp.indexOf("*"));
                e2 = exp.substring(e.length() + 1, exp.indexOf(String.valueOf(operators.elementAt(1))));

                exprAbstractClass = new Mult(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());

                e = exp.substring(exp.indexOf(String.valueOf(operators.elementAt(1))));
                exp = res+ e;
                operators.remove(operators.indexOf("*"));

            }
        }

        return exp;
    }

    private String addition(Stack operators,String exp) {
        String e = "";
        String e2 = "";
        if(operators.indexOf("+")>0) {

            if(operators.indexOf("+") == operators.size()-1) {
                e = exp.substring(exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("+")-1)))+1,
                        exp.indexOf("+"));
                e2 = exp.substring(exp.indexOf("+")+1);


                exprAbstractClass = new Add(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());

                exp = exp.substring(0,exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("+")-1)))+1) + res;
                operators.remove(operators.indexOf("+"));

            }else {
            e = exp.substring(exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("+") - 1))) + 1,
                    exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("+")))));

            e2 = exp.substring(exp.indexOf("+") + 1,
                    exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("+") + 1))));

                exprAbstractClass = new Add(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());

            e = exp.substring(0, exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("+") - 1))) + 1) + res;
            e2 = e + exp.substring(exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("+") + 1))));
            exp = e2;
                operators.remove(operators.indexOf("+"));

            }
        } else  {
            if(operators.size()==1) {
                e= exp.substring(0,exp.indexOf("+"));
                e2 = exp.substring(exp.indexOf("+")+1);

                exprAbstractClass = new Add(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());
                exp = res;
                operators.pop();
            }
            else {
                e = exp.substring(0, exp.indexOf("+"));

                e2 = exp.substring(e.length() + 1, exp.lastIndexOf(String.valueOf(operators.elementAt(1))));


                exprAbstractClass = new Add(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());
                e = exp.substring(exp.lastIndexOf(String.valueOf(operators.elementAt(1))));
                exp = res+ e;
                operators.remove(operators.indexOf("+"));

            }
        }

        return exp;
    }
    private String subraction(Stack operators,String exp) {
        String e = "";
        String e2 = "";
        if(operators.indexOf("-")>0) {

            if(operators.indexOf("-") == operators.size()-1) {
                e = exp.substring(exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("-")-1)))+1,
                        exp.indexOf("-"));
                e2 = exp.substring(exp.indexOf("-")+1);


                exprAbstractClass = new Sub(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());
                exp = exp.substring(0,exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("-")-1)))+1) + res;
                operators.remove(operators.indexOf("-"));

        }else{
                e = exp.substring(exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("-") - 1))) + 1,
                        exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("-")))));

                e2 = exp.substring(exp.indexOf("-") + 1,
                        exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("-") + 1))));


                exprAbstractClass = new Sub(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());

                e = exp.substring(0, exp.indexOf(String.valueOf(operators.elementAt(operators.indexOf("-") - 1))) + 1) + res;
                e2 = e + exp.substring(exp.lastIndexOf(String.valueOf(operators.elementAt(operators.indexOf("-") + 1))));
                exp = e2;
                operators.remove(operators.indexOf("-"));


            }
        } else  {
            if(operators.size()==1) {

                e= exp.substring(0,exp.indexOf("-"));
                e2 = exp.substring(exp.indexOf("-")+1);

                exprAbstractClass = new Sub(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());

                exp = res;
                operators.pop();
            }
            else {
                e = exp.substring(0, exp.indexOf("-"));
                e2 = exp.substring(e.length() + 1, exp.indexOf(String.valueOf(operators.elementAt(1))));

                exprAbstractClass = new Sub(new Number(Integer.parseInt(e)),new Number(Integer.parseInt(e2)));
                String res = Integer.toString(exprAbstractClass.eval());
                e = exp.substring(exp.indexOf(String.valueOf(operators.elementAt(1))));
                exp = res+ e;
                operators.remove(operators.indexOf("-"));

            }
        }

        return exp;
    }


}
