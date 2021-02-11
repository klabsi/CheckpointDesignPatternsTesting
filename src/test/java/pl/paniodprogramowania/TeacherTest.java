package pl.paniodprogramowania;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TeacherTest {

  @Mock
  private Student student;
  @Mock
  private Homework homework;

  @BeforeEach
  public void setUp(){
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void shouldBeAbleToSetHomework(){
    Teacher teacher = new Teacher("anyName", "Glowacki", "anyCity", student);
    teacher.setHomework(homework);
    verify(student).addHomework(homework);
  }

}