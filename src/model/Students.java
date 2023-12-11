package model;

import database.Database;
import model.enums.Gender;

import java.util.LinkedList;

public class Students {
    private long StudentId;
    private String StudentsName;
    private String StudentsLastname;
    private  String StudentsEmail;
    private String StudentsPassword;
    private Gender StudentsGenader;
    public LinkedList<Lessons>lessons;

    public Students() {
    }

    public long getStudentId() {
        return StudentId;
    }

    public void setStudentId(long studentId) {
        StudentId = studentId;
    }

    public String getStudentsName() {
        return StudentsName;
    }

    public void setStudentsName(String studentsName) {
        StudentsName = studentsName;
    }

    public String getStudentsLastname() {
        return StudentsLastname;
    }

    public void setStudentsLastname(String studentsLastname) {
        StudentsLastname = studentsLastname;
    }

    public String getStudentsEmail() {
        return StudentsEmail;
    }

    public void setStudentsEmail(String studentsEmail) {
        StudentsEmail = studentsEmail;
    }

    public String getStudentsPassword() {
        return StudentsPassword;
    }

    public void setStudentsPassword(String studentsPassword) {
        StudentsPassword = studentsPassword;
    }

    public Gender getStudentsGenader() {
        return StudentsGenader;
    }

    public void setStudentsGenader(Gender studentsGenader) {
        StudentsGenader = studentsGenader;
    }

    public LinkedList<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(LinkedList<Lessons> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Students{" +
                "StudentId=" + StudentId +
                ", StudentsName='" + StudentsName + '\'' +
                ", StudentsLastname='" + StudentsLastname + '\'' +
                ", StudentsEmail='" + StudentsEmail + '\'' +
                ", StudentsPassword='" + StudentsPassword + '\'' +
                ", StudentsGenader=" + StudentsGenader +
                '}';
    }
}
