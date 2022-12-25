package lesson_six;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Animal {
  private int maxRun;
  private int maxSwim;
  private int maxJump;

  public abstract boolean run(int dist);

  public abstract boolean swim(int dist);

  public abstract boolean jump(int dist);
}
