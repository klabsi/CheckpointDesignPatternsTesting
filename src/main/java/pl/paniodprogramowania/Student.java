package pl.paniodprogramowania;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Student {
    private PersonalData personalData;
    private Lesson lesson;
    private List<Homework> homework;

    public void doHomework(boolean hasInternet) {
        if (hasInternet) {
            this.homework.clear();
            System.out.println("With Internet done all homework!");
        } else {
            this.homework.removeIf(homework -> homework instanceof PracticalHomework);
            System.out.println("Without Internet only PRACTICAL homework dome");
        }
    }

    public void addHomework(List<Homework> homework) {
        this.homework.addAll(homework);
    }
}