package assignment8;

import assignment9.ExprAbstractClass;

public class Mult extends ExprAbstractClass {

    ExprAbstractClass a;
    ExprAbstractClass b;
    Mult(ExprAbstractClass a ,ExprAbstractClass b) {
        this.a  = a;
        this.b = b;
    }

    @Override
    public int eval() {
        return a.eval()*b.eval();
    }
}
