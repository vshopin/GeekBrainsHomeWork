package lesson_six;

public class AnimalsCompetitions {
  public static void main(String[] args) {
    Animal catBarsik = new Cat(300, 0, 5);
    Animal dogDrujok = new Dog(500, 100, 2);

    System.out.println(catBarsik.run(3200));
    System.out.println(catBarsik.swim(10));
    System.out.println(catBarsik.jump(40));
    System.out.println("-----------");

    System.out.println(dogDrujok.run(600));
    System.out.println(dogDrujok.swim(3));
    System.out.println(dogDrujok.jump(100));
  }
}
