package lessonFive;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Person {

  @Getter
  private String firstName;
  @Getter
  private String lastName;
  @Getter
  private String position;
  @Getter
  private String email;
  @Getter
  private String phone;
  @Getter
  private int salary;
  @Getter
  private int age;
}
