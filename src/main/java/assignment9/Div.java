package assignment9;

public class Div extends ExprAbstractClass{

    ExprAbstractClass a;
    ExprAbstractClass b;

    public Div(ExprAbstractClass a, ExprAbstractClass b){
        this.a = a;
        this.b = b;
    }

    public int eval() {
      return a.eval()/b.eval();
    }
}
