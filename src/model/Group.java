package model;

import java.util.LinkedList;

public class Group {
    private long GroupId;
    private String GroupName;
    private String Discription;
    public LinkedList<LinkedList<Lessons>> lessons = new LinkedList<LinkedList<Lessons>>();
    public  LinkedList<Students> students = new LinkedList<>();

    public Group() {
    }

    public long getGroupId() {
        return GroupId;
    }

    public void setGroupId(long groupId) {
        GroupId = groupId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }


    public LinkedList<LinkedList<Lessons>> getLessons() {
        return lessons;
    }

    public void setLessons(LinkedList<LinkedList<Lessons>> lessons) {
        this.lessons = lessons;
    }

    public LinkedList<Students> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "GroupId=" + GroupId +
                ", GroupName='" + GroupName + '\'' +
                ", Discription='" + Discription + '\'' +
                ", lessons=" + lessons +
                ", students=" + students +
                '}';
    }
}
