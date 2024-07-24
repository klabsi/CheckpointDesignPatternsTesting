package pl.paniodprogramowania;

import lombok.Builder;

import java.util.List;

@Builder
public class Teacher {
    private PersonalData personalData;
    private List<Student> students;

    public void setHomework(List<Homework> homework) {
        for (Student student : students) {
            student.addHomework(homework);
        }
    }
}
