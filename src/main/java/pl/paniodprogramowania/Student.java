package pl.paniodprogramowania;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Student {
    private PersonalData personalData;
    private Lesson lesson;
    private List<Homework> homeworks;
    private HomeworkCompleting homeworkCompleting;

    public void doHomework(List<Homework> homeworks) {
        homeworkCompleting.doHomework(homeworks);
    }

    public void addHomework(List<Homework> homework) {
        this.homeworks.addAll(homework);
    }
}