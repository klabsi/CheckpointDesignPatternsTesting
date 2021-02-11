package pl.paniodprogramowania;

public class Teacher {
  private String name;
  private String surname;
  private String city;
  private Student student;

  public Teacher(String name, String surname, String city) {
    this.name = name;
    this.surname = surname;
    this.city = city;
  }

  public Teacher(String name, String surname, String city, Student student) {
    this.name = name;
    this.surname = surname;
    this.city = city;
    this.student = student;
  }

  public void setHomework(Homework homework){
    this.student.addHomework(homework);
  }
}
