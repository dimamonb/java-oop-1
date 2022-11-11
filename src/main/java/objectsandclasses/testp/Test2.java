package objectsandclasses.testp;

public class Test2 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        swap1(a[0], a[1]);
        System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);

        swap2(a);
        System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
    }
    public static void swap1(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swap2(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
