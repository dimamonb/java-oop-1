package oothinking.bmi;

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Сергей Иванович П.", 18, 60, 178);
        System.out.println("BMI для " + bmi1.getName() + " равно "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Андрей Петрович Н.", 100, 178);
        System.out.println("BMI для " + bmi2.getName() + " равно "
                + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
