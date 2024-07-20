public class Rectangle extends Shape implements Resizable,  Manufacture {
    public int length;
    public int width;

    public Rectangle(String name, String color) {
        super(name, color);
    }

    public int calculatePerimeter() {
        printSuper();
        return 2 * (length + width);
    }

    @Override
    public boolean canDo() {
        return false;
    }

    @Override
    public boolean isPossible() {
        return false;
    }

    @Override
    public double calArea() {
        return 0;
    }
}
