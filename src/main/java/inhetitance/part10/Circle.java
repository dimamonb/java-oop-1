package inhetitance.part10;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Возвращает радиус */
    public double getRadius() {
        return radius;
    }

    /** Присваивает новый радиус */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Возвращает площадь */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Возвращает диаметр */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Возвращает периметр */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Отображает информацию о круге */
    public void printCircle() {
        System.out.println("Круг создан " + getDateCreated() +
                " и радиус равен " + radius);
    }

    @Override
    public String toString() {
        return super.toString() + "\nрадиус равен " + radius;
    }
}
