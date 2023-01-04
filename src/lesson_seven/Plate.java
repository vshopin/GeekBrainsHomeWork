package lesson_seven;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Plate {
  private int food;

  public void info() {
    System.out.printf("plate: %s\n", food);
  }

  public boolean decreaseFood(int appetite) {
    if (appetite > food) {
      System.out.printf("Коту не удалось поесть, требуется положить еды: %s\n", appetite - food);
      return false;
    } else {
      food -= appetite;
      return true;
    }
  }

  public void putFood(int newFood) {
    food += newFood;
    if (food > 0) {
      System.out.printf("Еда наложена, теперь еды в тарелке: %s\n", food);
    } else {
      System.out.println("Еды не хватает, положите больше!");
    }
  }
}
