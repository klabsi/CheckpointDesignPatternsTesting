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
    homeworks.add(new PracticalHomework());
    homeworks.add(new ArticleHomework());
    Student student = Student.builder()
            .personalData(PersonalData.builder().name("Anna").surname("Herrman").city("anyCity").build())
            .homework(homeworks)
            .build();

    //when
    student.doHomework(true);

    //then
    assertEquals(0, student.getHomework().size());
  }

  @Test
  public void shouldNotDoAllHomeworkWhenHasNoInternet(){
    //given
    List<Homework> homeworks = new ArrayList<>();
    homeworks.add(new PracticalHomework());
    homeworks.add(new ArticleHomework());
    Student student = Student.builder()
            .personalData(PersonalData.builder().name("Anna").surname("Herrman").city("anyCity").build())
            .homework(homeworks)
            .build();

    //when
    student.doHomework(false);

    //then
    assertEquals(1, student.getHomework().size());
  }

  @Test
  public void shouldDoAllHomeworkWhenHasNoInternetButPracticalHomework(){
    //given
    List<Homework> homeworks = new ArrayList<>();
    homeworks.add(new PracticalHomework());
    homeworks.add(new PracticalHomework());
    Student student = Student.builder()
            .personalData(PersonalData.builder().name("Anna").surname("Herrman").city("anyCity").build())
            .homework(homeworks)
            .build();

    //when
    student.doHomework(false);

    //then
    assertEquals(0, student.getHomework().size());
  }

  @Test
  public void shouldDoAllHomeworkWhenHasNoInternetButNoHomework(){
    //given
    List<Homework> homeworks = new ArrayList<>();
    Student student = Student.builder()
            .personalData(PersonalData.builder().name("Anna").surname("Herrman").city("anyCity").build())
            .homework(homeworks)
            .build();

    //when
    student.doHomework(false);

    //then
    assertEquals(0, student.getHomework().size());
  }
}