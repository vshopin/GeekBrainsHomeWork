package lessonSix;

public abstract class Animal {
    protected int maxRun;
    protected int maxSwim;
    protected int maxJump;

    public Animal(int maxRun, int maxSwim, int maxJump) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    public abstract boolean run(int dist);
    public abstract boolean swim(int dist);
    public abstract boolean jump(int dist);
}
