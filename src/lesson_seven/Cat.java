package lesson_seven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Cat {
  private String name;
  private int appetite;
  private boolean satiety;

  public void eat(Plate plate) {
    if (plate.decreaseFood(appetite)) {
      satiety = true;
      System.out.printf("Кот %s поел, его сытость : %s\n", name, satiety);
    }
  }
}
