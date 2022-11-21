package inhetitance.part10.test;

public class Test {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}
class Student extends Person {
    @Override
    public String getInfo() {
        return "Студент";
    }
}
class Person {
    public String getInfo() {
        return "Человек";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}
