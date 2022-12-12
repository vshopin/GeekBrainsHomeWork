package lessonSix;

public class Dog extends Animal {

    public Dog(int maxRun, int maxSwim, int maxJump) {
        super(maxRun, maxSwim, maxJump);
    }

    @Override
    public boolean run(int dist) {
        if (this.maxRun >= dist) {
            System.out.printf("Cобака пробежала дистанцию %s", dist);
            System.out.println();
            return true;
        }
        System.out.printf("Cобака не смогла пробежать дистанцию %s", dist);
        System.out.println();
        return false;
    }

    @Override
    public boolean swim(int dist) {
        if (this.maxRun >= dist) {
            System.out.printf("Собака проплыла дистанцию %s", dist);
            System.out.println();
            return true;
        }
        System.out.printf("Собака не смогла проплыть дистанцию %s", dist);
        System.out.println();
        return false;
    }

    @Override
    public boolean jump(int dist) {
        if (this.maxRun >= dist) {
            System.out.printf("Собака прыгнула на дистанцию %s", dist);
            System.out.println();
            return true;
        }
        System.out.printf("Собака не смогла прыгнуть дистанцию %s", dist);
        System.out.println();
        return false;
    }
}
