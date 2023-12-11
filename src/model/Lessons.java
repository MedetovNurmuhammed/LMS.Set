package model;

public class Lessons {
    private long LessonId;
    private String LessonNAme;
    private String taskDiscription;

    public Lessons() {
    }

    public long getLessonId() {
        return LessonId;
    }

    public void setLessonId(long lessonId) {
        LessonId = lessonId;
    }

    public String getLessonNAme() {
        return LessonNAme;
    }

    public void setLessonNAme(String lessonNAme) {
        LessonNAme = lessonNAme;
    }

    public String getTaskDiscription() {
        return taskDiscription;
    }

    public void setTaskDiscription(String taskDiscription) {
        this.taskDiscription = taskDiscription;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "LessonId=" + LessonId +
                ", LessonNAme='" + LessonNAme + '\'' +
                ", taskDiscription='" + taskDiscription + '\'' +
                '}';
    }
}
