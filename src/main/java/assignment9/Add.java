package assignment9;

public class Add extends ExprAbstractClass {

    ExprAbstractClass a;
    ExprAbstractClass b;

    Add(ExprAbstractClass a, ExprAbstractClass b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int eval() {
        return a.eval()+b.eval();
    }
}
