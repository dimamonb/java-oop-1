package oothinking.bmi;

public class BMI {
    private static final int SMS_PER_METER = 100;
    private String name;
    private int age;
    private double weight;
    private double sms;
    private double meters;

    public BMI(String name, double weight, double sms) {
        this.name = name;
        this.weight = weight;
        this.sms = sms;
    }

    public BMI(String name, int age, double weight, double sms) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sms = sms;
    }

    public BMI(String name, int age, double weight, double meters, double sms) {
        this.name = name;
        this.weight = weight;
        this.meters = meters;
        this.sms = sms;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getSms() {
        return sms;
    }

    public double getBMI() {
        return weight / (sms / SMS_PER_METER * sms / SMS_PER_METER);
    }

    public String getStatus() {
        double bmi = getBMI();
        System.out.println("BMI равно " + bmi);
        if (bmi < 18.5)
            return "Недостаточный вес";
        else if (bmi < 25)
            return "Норма";
        else if (bmi < 30)
            return "Избыточный вес";
        else
            return "Ожирение";
    }
}
