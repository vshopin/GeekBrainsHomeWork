package lesson_seven;

public class CatEat {
  public static void main(String[] args) {
    Plate plate = new Plate(500);

    Cat[] catArray = new Cat[5];
    catArray[0] = new Cat("Barsik", 50, false);
    catArray[1] = new Cat("Murzik", 150, false);
    catArray[2] = new Cat("Persik", 70, false);
    catArray[3] = new Cat("Pirojok", 200, false);
    catArray[4] = new Cat("Kaka", 60, false);

    for (Cat animal : catArray) {
      animal.eat(plate);
    }
  }
}
