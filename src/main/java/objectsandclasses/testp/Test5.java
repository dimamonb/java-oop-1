package objectsandclasses.testp;

import java.util.Date;
public class Test5 {
    public static void main(String[] args) {
        Date date = new Date(123456);
        m1(date);
        System.out.println(date);
    }
    public static void m1(Date date) {
        date = new Date(7654321);
    }
    public static void m2(Date date) {
        date.setTime(7654321);
    }
}
