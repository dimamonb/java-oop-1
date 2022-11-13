package oothinking.part8;

public class MyString1Test {
    public static void main(String[] args) {
        MyString1 ms1 = new MyString1(new char[]{'J', 'A', 'V', 'A', '1', '3', '0', '1'});
        MyString1 ms2 = new MyString1("JAVA".toCharArray());
        MyString1 r1 = ms1.substring(1, 4);
        System.out.println(r1);
        System.out.println(ms1.charAt(5));
        System.out.println(ms1.toLowerCase());
    }
}
