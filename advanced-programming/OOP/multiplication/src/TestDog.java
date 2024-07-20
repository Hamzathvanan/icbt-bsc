public class TestDog {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        dog1.move();
        dog1.animText();

        Dog dog2 = new Dog();
        dog2.move();

        Dog dg;
        dg = dog2;
        dg.move();
    }
}
