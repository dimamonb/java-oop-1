package inhetitance.part10.test;
public class Test4 {
    public static void main(String[] args) {
        new A1();
        new B1();
    }
}
class A1 {
    int i = 7;
    public A1() {
        setI(20);
        System.out.println("i из класса A равно " + i);
    }
    public void setI(int i) {
        this.i = 2 * i;
    }
}
class B1 extends A1 {
    public B1() {
        System.out.println("i из класса B равно " + i);
    }
    public void setI(int i) {
        this.i = 3 * i;
    }
}