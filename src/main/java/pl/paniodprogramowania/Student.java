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

    public void doHomework(boolean hasInternet) {
        if (hasInternet) {
            this.homeworks.clear();
            System.out.println("With Internet done all homework!");
        } else {
            this.homeworks.removeIf(homework -> homework instanceof PracticalHomework);
            System.out.println("Without Internet only PRACTICAL homework dome");
        }
    }

    public void addHomework(List<Homework> homework) {
        this.homeworks.addAll(homework);
    }
}