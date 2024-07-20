public class Circle extends Shape {
    public int radius;

    public Circle(String name, String color) {
        super(name, color);
    }

    public int getDiameter() {
        return 2 * radius;
    }
    @Override
    public String testRet() {
        return "Override Parent";
    }

    public String testReturn() {
        return "Child text" + super.testRet();
    }

    @Override
    public double calArea() {
        return 0;
    }
}
