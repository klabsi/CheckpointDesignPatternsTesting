package pl.paniodprogramowania;

import java.util.List;

public class Student {
  private String name;
  private String surname;
  private String city;
  private String lessonGroupId;
  private String lessonId;
  private List<Homework> homework;
  private boolean hasInternet;

  public Student(String name) {
    this.name = name;
  }

  public Student(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public Student(String name, String surname, String city) {
    this.name = name;
    this.surname = surname;
    this.city = city;
  }

  public Student(String name, String surname, String city, String lessonGroupId) {
    this.name = name;
    this.surname = surname;
    this.city = city;
    this.lessonGroupId = lessonGroupId;
  }

  public Student(String name, String surname, String city, String lessonGroupId, String lessonId) {
    this.name = name;
    this.surname = surname;
    this.city = city;
    this.lessonGroupId = lessonGroupId;
    this.lessonId = lessonId;
  }

  public Student(String name, String surname, String city, String lessonGroupId, String lessonId, List<Homework> homework) {
    this.name = name;
    this.surname = surname;
    this.city = city;
    this.lessonGroupId = lessonGroupId;
    this.lessonId = lessonId;
    this.homework = homework;
  }

  public Student(String name, String surname, String city, String lessonGroupId, String lessonId, List<Homework> homework, boolean hasInternet) {
    this.name = name;
    this.surname = surname;
    this.city = city;
    this.lessonGroupId = lessonGroupId;
    this.lessonId = lessonId;
    this.homework = homework;
    this.hasInternet = hasInternet;
  }

  public Student(String name, String surname, String city, List<Homework> homework,
                 Boolean hasInternet) {
    this.name = name;
    this.surname = surname;
    this.city = city;
    this.homework = homework;
    this.hasInternet = hasInternet;
  }

  public void doHomework(){
    if (hasInternet){
      this.homework.clear();
      System.out.println("With Internet done all homework! ");
    } else {
      this.homework = this.homework.subList(0, Math.max(this.homework.size() - 2, 0));
      System.out.println("Without Internet only partially done homework");
    }
  }

  public void addHomework(Homework homework) {
    this.homework.add(homework);
  }

  public List<Homework> getHomework() {
    return homework;
  }
}
