package lessonFive;

public class ListPerson {
  public static void main(String[] args) {

    Person[] personArray = new Person[5];
    personArray[0] = new Person("Ivan", "Ivanov", "Developer", "ivanov@gmail.com", "79130000102", 200000, 42);
    personArray[1] = new Person("Petr", "Petrov", "Developer", "petrov@gmail.com", "79130000103", 160000, 55);
    personArray[2] = new Person("Semen", "Sidorov", "Administrator", "sidorov@gmail.com", "79130000104", 50000, 50);
    personArray[3] = new Person("Dima", "Medvedev", "Devops", "medvedev@gmail.com", "79130000105", 150000, 35);
    personArray[4] = new Person("Igor", "Zemlin", "QA", "zemlin@gmail.com", "79130000106", 30000, 25);


    for (Person person : personArray) {
      if (person.getAge() >= 40) {
        System.out.println(person);
      }
    }
  }
}
