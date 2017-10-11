package pojo;

import java.io.Serializable;

public class Lesson implements Serializable{
  private final int id;
  private final String dateTime;
  private final String topic;
  private final String roomNum;
  private final String teacher;

  public Lesson(int id, String dateTime,
                String topic, String roomNum, String teacher) {
    this.id = id;
    this.dateTime = dateTime;
    this.topic = topic;
    this.roomNum = roomNum;
    this.teacher = teacher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Lesson)) return false;

    Lesson lesson = (Lesson) o;

    if (getDateTime() != lesson.getDateTime()) return false;
    if (getRoomNum() != lesson.getRoomNum()) return false;
    if (!getTopic().equals(lesson.getTopic())) return false;
    return getTeacher().equals(lesson.getTeacher());
  }

  @Override
  public int hashCode() {
    int result = (id ^ (id >>> 32));
    result = 31 * result + dateTime.hashCode();
    result = 31 * result + topic.hashCode();
    result = 31 * result + teacher.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "id : " + id + "\n" +
            "date : " + dateTime + "\n" +
            "theme : " + topic + "\n" +
            "office number : " + roomNum + "\n" +
            "teacher : " + teacher + "\n" +
            "--------------------------------\n";
  }

  public int getId() {
    return id;
  }

  public String getDateTime() {
    return dateTime;
  }
  public String getTopic() {
    return topic;
  }
  public String getRoomNum() {
    return roomNum;
  }
  public String getTeacher() {
    return teacher;
  }
}
