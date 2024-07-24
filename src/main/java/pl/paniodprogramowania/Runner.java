package pl.paniodprogramowania;

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
                .homework(new ArrayList<>())
                .build();

        Student studentPiotr = Student.builder()
                .personalData(PersonalData.builder()
                        .name("Piotr")
                        .surname("Wojcik")
                        .city("Warszawa")
                        .build())
                .homework(new ArrayList<>())
                .build();

        Teacher teacherAnia = Teacher.builder()
                .personalData(PersonalData.builder()
                        .name("Ania")
                        .surname("Glowacka")
                        .city("Krakow")
                        .build())
                .students(new ArrayList<>(Collections.singletonList(studentBeata)))
                .build();
        teacherAnia.setHomework(new ArrayList<>(Arrays.asList(new PracticalHomework(), new ArticleHomework())));
        studentBeata.doHomework(true);

        Teacher teacherWojtek = Teacher.builder()
                .personalData(PersonalData.builder()
                        .name("Wojtek")
                        .surname("Glowacki")
                        .city("Krakow")
                        .build())
                .students(new ArrayList<>(Collections.singletonList(studentPiotr)))
                .build();
        teacherWojtek.setHomework(new ArrayList<>(Arrays.asList(new PracticalHomework(), new ArticleHomework())));
        studentPiotr.doHomework(false);
    }
}