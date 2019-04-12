package assignment8;

import assignment9.ExprAbstractClass;

public class Number extends ExprAbstractClass {

    int a;

    public Number(int a){
        this.a = a;
    }

    @Override
    public int eval() {
        return a;
    }
}
