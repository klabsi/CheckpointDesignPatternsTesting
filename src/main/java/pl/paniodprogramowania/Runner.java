package pl.paniodprogramowania;

import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    Student studentBeata = new Student("Beata", "Nowak", "Krakow", "4", "1", new ArrayList<>(),
        true);

    Student studentPiotr = new Student("Piotr", "Wojcik", "Warszawa", new ArrayList<Homework>(),
        false);

    Teacher teacherAnia = new Teacher("Ania", "Glowacka", "Krakow", studentBeata);
    teacherAnia.setHomework(new Homework("do this exercise", "read this article"));
    studentBeata.doHomework();

    Teacher teacherWojtek = new Teacher("Wojtek", "Glowacki", "Krakow", studentPiotr);
    teacherWojtek.setHomework(new Homework("do this exercise", "read this article"));
    studentPiotr.doHomework();
  }
}
