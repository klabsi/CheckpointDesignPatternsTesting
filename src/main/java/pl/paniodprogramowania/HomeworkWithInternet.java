package pl.paniodprogramowania;

import java.util.List;

public class HomeworkWithInternet implements HomeworkCompleting {
    @Override
    public List<Homework> doHomework(List<Homework> homeworks) {
        System.out.println("With Internet done all homework! ");
        homeworks.clear();
        return homeworks;
    }
}
