package lessonFive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames = false)
public class Person {

  private String firstName;
  private String lastName;
  private String position;
  private String email;
  private String phone;
  private int salary;
  private int age;
}
