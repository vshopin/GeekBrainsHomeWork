package lessonSix;

public class Test {
    public static void main(String[] args) {
        Animal cat1 = new Cat(300, 0, 5);
        Animal dog1 = new  Dog(500, 100, 2);

        System.out.println(cat1.run(3200));
        System.out.println(cat1.swim(10));
        System.out.println(cat1.jump(40));
        System.out.println("-----------");

        System.out.println(dog1.run(600));
        System.out.println(dog1.swim(3));
        System.out.println(dog1.jump(100));
    }
}
