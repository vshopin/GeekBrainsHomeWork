package lessonSix;

public class Dog extends Animal {

    private static final int DOG_RUN = 200;
    private static final int DOG_JUMP = 1;
    private static final int DOG_SWIM = 10;

    public Dog(String name) {
        super(name);
    }

    public void run(int run) {
        System.out.println("run: " + (run <= DOG_RUN));
    }

    public void swim(int swim) {
        System.out.println("swim: " + (swim <= DOG_SWIM));
    }

    public void jump(int jump) {
        System.out.println("jump" + (jump <= DOG_JUMP));
    }
}
