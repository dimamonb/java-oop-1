package objectsandclasses.testp;

public class Test4 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        System.out.println("t1 i = " + t1.i + " и j = " + t1.j);
        System.out.println("t2 i = " + t2.i + " и j = " + t2.j);
    }
}
class T1 {
    static int i = 0;
    int j = 0;
    T1() {
        i++;
        j = 1;
    }
}
