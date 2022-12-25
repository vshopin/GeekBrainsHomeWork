package lessonSix;


public class Cat extends Animal {

    public Cat(int maxRun, int maxSwim, int maxJump) {
        super(maxRun, maxSwim, maxJump);
    }

    @Override
    public boolean run(int dist) {
        if (this.maxRun >= dist) {
            System.out.printf("Кот пробежал дистанцию %s\n", dist);
            return true;
        }
        System.out.printf("Кот не смог пробежать дистанцию %s\n", dist);
        return false;
    }

    @Override
    public boolean swim(int dist) {
        System.out.println("Кот не умеет плавать");
        return false;
    }

    @Override
    public boolean jump(int dist) {
        if (this.maxRun >= dist) {
            System.out.printf("Кот прыгнул на дистанцию %s\n", dist);
            return true;
        }
        System.out.printf("Кот не смог прыгнуть на дистанцию %s\n", dist);
        return false;
    }
}
