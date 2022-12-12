package lessonSix;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("cat1");
        Dog dog1 = new Dog("dog1");

        cat1.run(150);
        cat1.swim();
        cat1.jump(20);

        dog1.swim(15);
        dog1.run(300);
        dog1.jump(4);
    }
}
