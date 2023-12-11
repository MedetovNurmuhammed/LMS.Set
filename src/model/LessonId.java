package model;

public class LessonId {
    private static long counter = 0;
    public static long geneteId(){
        return ++counter;
    }
}
