package inhetitance.part10;

public class PolymorphismDemo {
    /** Метод main */
    public static void main(String[] args) {
        // Отобразить свойства круга и прямоугольника
        displayObject(new Circle(1, "красный", false));
        displayObject(new Rectangle(1, 1, "черный", true));

        Circle circle = new Circle();
        GeometricObject object = new GeometricObject();
        Object t = new Triangle();
        Triangle tt = (Triangle) t;

        System.out.printf("a. (circle instanceof GeometricObject) == %b\n", circle instanceof GeometricObject);
        System.out.printf("a. (object instanceof GeometricObject) == %b\n", object instanceof GeometricObject);
        System.out.printf("a. (circle instanceof Circle) == %b\n", circle instanceof Circle);
        System.out.printf("a. (object instanceof Circle) == %b\n", object instanceof Circle);
    }

    /** Отображает свойства геометрического объекта */
    public static void displayObject(GeometricObject object) {
        System.out.println("Объект создан " + object.getDateCreated() +
                "\nЦвет равен " + object.getColor());
    }
}
