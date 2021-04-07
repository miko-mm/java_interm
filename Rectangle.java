public class Rectangle extends Shape {

    private final double length;
    private final double breadth;

    public Rectangle(final double length, final double breadth) {
        super("RECTANGLE", length * breadth, 2 * (length + breadth));
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

