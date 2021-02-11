package pl.paniodprogramowania;

public class Homework {
  private String practicalHomework;
  private String articleToRead;
  private String finalDate;

  public Homework(String practicalHomework) {
    this.practicalHomework = practicalHomework;
  }

  public Homework(String practicalHomework, String articleToRead) {
    this.practicalHomework = practicalHomework;
    this.articleToRead = articleToRead;
  }

  public Homework(String practicalHomework, String articleToRead, String finalDate) {
    this.practicalHomework = practicalHomework;
    this.articleToRead = articleToRead;
    this.finalDate = finalDate;
  }

  public String getPracticalHomework() {
    return practicalHomework;
  }

  public String getArticleToRead() {
    return articleToRead;
  }

  public String getFinalDate() {
    return finalDate;
  }

  public Homework setPracticalHomework(String practicalHomework) {
    this.practicalHomework = practicalHomework;
    return this;
  }

  public Homework setArticleToRead(String articleToRead) {
    this.articleToRead = articleToRead;
    return this;
  }

  public Homework setFinalDate(String finalDate) {
    this.finalDate = finalDate;
    return this;
  }
}
