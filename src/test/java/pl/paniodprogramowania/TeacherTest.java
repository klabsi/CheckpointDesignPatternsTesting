package pl.paniodprogramowania;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherTest {

  @Mock
  private Student student;
  @Mock
  private List<Homework> homework;

  @BeforeEach
  public void setUp(){
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void shouldBeAbleToSetHomework(){
    Teacher teacher = Teacher.builder()
            .personalData(PersonalData.builder().name("anyName").surname("Glowacki").city("anyCity").build())
                    .students(new ArrayList<>(Collections.singletonList(student)))
            .build();
    teacher.setHomework(homework);
    verify(student).addHomework(homework);
  }

}