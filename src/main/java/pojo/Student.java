package pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Student implements Serializable {
    private int id;
    private String firstName;
    private String secondName;
    private String familyName;
    private String birthDay;
    private int group_id;


    public Student() {
    }

    public Student(int id, String firstName, String secondName, String familyName, String birthDay, int group_id) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.familyName = familyName;
        this.birthDay = birthDay;
        this.group_id = group_id;
    }

    public Student(String fName, String sName,
                   String familyName, String birthDay, int group_id) {
        this.id = 0;
        this.firstName = fName;
        this.secondName = sName;
        this.familyName = familyName;
        this.birthDay = birthDay;
        this.group_id = group_id;
    }

    @Override
    public String toString() {
        return "id : " + id + "\n" +
                "firstName : " + firstName + "\n" +
                "secondName : " + secondName + "\n" +
                "familyName : " + familyName + "\n" +
                "birthday : " + birthDay + "\n" +
                "--------------------------------\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (!firstName.equals(student.firstName)) return false;
        if (!secondName.equals(student.secondName)) return false;
        if (!familyName.equals(student.familyName)) return false;
        return birthDay == student.birthDay;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + familyName.hashCode();
        return result;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @XmlElement
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFamilyName() {
        return familyName;
    }

    @XmlElement
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


}
