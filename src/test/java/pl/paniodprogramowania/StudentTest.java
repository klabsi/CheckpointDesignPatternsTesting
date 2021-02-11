package pl.paniodprogramowania;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StudentTest {

  @Test
  public void shouldDoAllHomeworkWhenHasInternet(){
    //given
    List<Homework> homeworks = new ArrayList<>();
    homeworks.add(new Homework("anyPracticalHomework"));
    Student student = new Student("Anna", "Herrman", "anyCity", homeworks, true);

    //when
    student.doHomework();

    //then
    assertEquals(0, student.getHomework().size());
  }

  @Test
  public void shouldNotDoAllHomeworkWhenHasNoInternet(){
    //given
    List<Homework> homeworks = new ArrayList<>();
    homeworks.add(new Homework("anyPracticalHomework"));
    homeworks.add(new Homework("anyPracticalHomework"));
    homeworks.add(new Homework("anyPracticalHomework"));
    homeworks.add(new Homework("anyPracticalHomework"));
    Student student = new Student("Anna", "Herrman", "anyCity", homeworks, false);

    //when
    student.doHomework();

    //then
    assertEquals(2, student.getHomework().size());
  }

  @Test
  public void shouldDoAllHomeworkWhenHasNoInternetButNoHomework(){
    //given
    List<Homework> homeworks = new ArrayList<>();
    Student student = new Student("Anna", "Herrman", "anyCity", homeworks, false);

    //when
    student.doHomework();

    //then
    assertEquals(0, student.getHomework().size());
  }
}
