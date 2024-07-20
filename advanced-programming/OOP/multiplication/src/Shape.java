public abstract class Shape{
    public String name;
    public String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape() {

    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public void printSuper() {
        System.out.println("Hi i am super");
    }

    public String testRet(){
        return "Parent Text";
    }

    public abstract double calArea();
}
