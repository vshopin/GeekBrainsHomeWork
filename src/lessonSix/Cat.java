package lessonSix;

public class Cat extends Animal {
    private static final int CAT_RUN = 200;
    private static final int CAT_JUMP = 2;

    public Cat(String name) {
        super(name);
    }

    public void run(int run) {
        System.out.println("run: " + (run <= CAT_RUN));
    }

    public void swim() {
        System.out.println("Кот не умеет плавать");
    }

    public void jump(int jump) {
        System.out.println("jump: " + (jump <= CAT_JUMP));
    }
}
