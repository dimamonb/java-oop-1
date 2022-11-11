package objectsandclasses.part1;

public class Rectangle {
    private double heigth = -1;
    private double width = -1;

    public Rectangle() {
    }

    public Rectangle(double heigth, double width) {
        this.heigth = heigth;
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return heigth * width;
    }

    public double getPerimeter() {
        return 2 * (heigth + width);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(40, 4);
        Rectangle rect2 = new Rectangle(35.9, 3.5);
        String output1 = String.format("Heigth: %f, Width: %f, Area: %f, Perimeter: %f",
                rect1.heigth, rect1.width, rect1.getArea(), rect1.getPerimeter());
        String output2 = String.format("Heigth: %f, Width: %f, Area: %f, Perimeter: %f",
                rect2.heigth, rect2.width, rect2.getArea(), rect2.getPerimeter());
        System.out.println(output1);
        System.out.println(output2);
    }
}
