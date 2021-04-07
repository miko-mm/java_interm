public class Triangle extends Shape{

    private final double height;
    private final double base;

    public Triangle(final double height, final double base) {
        super("Triangle", 0.5 * height * base, 3 * (base)); // is like calling the constructor
        this.height = height;
        this.base = base;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Height: " + height);
        System.out.println("Base: " + base);
    }
}

