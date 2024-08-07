package pl.paniodprogramowania;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        Student studentBeata = Student.builder()
                .personalData(PersonalData.builder()
                        .name("Beata")
                        .surname("Nowak")
                        .city("Krakow")
                        .build())
                .lesson(Lesson.builder().lessonGroupId(4).lessonId(1).build())
                .homeworks(new ArrayList<>())
                .homeworkCompleting(new HomeworkWithInternet())
                .build();

        Student studentPiotr = Student.builder()
                .personalData(PersonalData.builder()
                        .name("Piotr")
                        .surname("Wojcik")
                        .city("Warszawa")
                        .build())
                .homeworks(new ArrayList<>())
                .homeworkCompleting(new HomeworkWithoutInternet())
                .build();

        Teacher teacherAnia = Teacher.builder()
                .personalData(PersonalData.builder()
                        .name("Ania")
                        .surname("Glowacka")
                        .city("Krakow")
                        .build())
                .students(new ArrayList<>(Collections.singletonList(studentBeata)))
                .build();
        teacherAnia.setHomework(new ArrayList<>(Arrays.asList
                (new PracticalHomework("do this exercise", Instant.parse("2024-09-15T21:35:00.00Z")),
                        new ArticleHomework("read this article", Instant.parse("2024-09-15T21:35:00.00Z")))));
        studentBeata.doHomework(studentBeata.getHomeworks());

        Teacher teacherWojtek = Teacher.builder()
                .personalData(PersonalData.builder()
                        .name("Wojtek")
                        .surname("Glowacki")
                        .city("Krakow")
                        .build())
                .students(new ArrayList<>(Collections.singletonList(studentPiotr)))
                .build();
        teacherWojtek.setHomework(new ArrayList<>(Arrays.asList
                (new PracticalHomework("do this exercise", Instant.parse("2024-09-15T21:35:00.00Z")),
                new ArticleHomework("read this article", Instant.parse("2024-09-15T21:35:00.00Z")))));
        studentPiotr.doHomework(studentPiotr.getHomeworks());
    }
}