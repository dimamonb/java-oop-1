package inhetitance.part10.test;

public class Test1 {
    public static void main(String[] args) {
        new Person1().printPerson();
        new Student1().printPerson();
    }
}
class Student1 extends Person {
//    private
    public String getInfo() {
        return "Студент";
    }
}
class Person1 {
    private String getInfo() {
        return "Человек";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}
