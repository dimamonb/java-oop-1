package inhetitance.part10.test;

public class Test3 {
    public static void main(String[] args) {
        A a = new A(3);
    }
}

class A extends B {
    public A(int t) {
        System.out.println("Вызывается конструктор класса A");
    }
}

class B {
    public B() {
        System.out.println("Вызывается конструктор класса B");
    }
}
