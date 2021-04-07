// Extract the Shape classes and experiment with them. Make them compile. Create some shapes and print them.

public class Shape {

    private final String type;
    private final double area;
    private final double perimeter;

    public Shape(final String type, final double area, final double perimeter) {
        this.type = type;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void print() {
        System.out.println("Name: " + type);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

