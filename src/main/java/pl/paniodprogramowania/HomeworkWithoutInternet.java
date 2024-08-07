package pl.paniodprogramowania;

import java.util.List;

public class HomeworkWithoutInternet implements HomeworkCompleting {
    @Override
    public List<Homework> doHomework(List<Homework> homeworks) {
        System.out.println("Without Internet only partially done homework");
        return homeworks.subList(0, Math.max(homeworks.size() - 2, 0));
    }
}