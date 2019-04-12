package assignment9;

public class Sub extends ExprAbstractClass {

    ExprAbstractClass a;
    ExprAbstractClass b;

    Sub(ExprAbstractClass a, ExprAbstractClass b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int eval() {
        return a.eval()-b.eval();
    }
}
