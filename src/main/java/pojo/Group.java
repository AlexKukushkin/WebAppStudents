package pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Group implements Serializable{
  private int groupNum;
  private String groupName;

  public Group(int groupNum, String gName) {
    this.groupNum = groupNum;
    this.groupName = gName;
  }

  public Group() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Group)) return false;

    Group group = (Group) o;

    if (getGroupNum() != group.getGroupNum()) return false;
    return getGroupName().equals(group.getGroupName());
  }

  @Override
  public int hashCode() {
    int result = getGroupNum();
    result = 31 * result + getGroupName().hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Group{" +
            "group number = " + groupNum +
            ", group name = " + groupName + '\'' +
            '}';
  }

  public void setGroupNum(int groupNum) {
    this.groupNum = groupNum;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public String getGroupName() {

    return groupName;
  }

  public int getGroupNum() { return groupNum; }
}
