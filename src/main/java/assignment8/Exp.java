package assignment8;

public abstract class Exp {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public abstract int times(int n1, int n2) ;
    public abstract int plus(int n1, int n2);

    public abstract int divide(int n1, int n2);

    public abstract int subract(int n1, int n2) ;
}
