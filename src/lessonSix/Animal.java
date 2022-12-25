package lessonSix;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Animal {
    protected int maxRun;
    protected int maxSwim;
    protected int maxJump;

    public abstract boolean run(int dist);
    public abstract boolean swim(int dist);
    public abstract boolean jump(int dist);
}
