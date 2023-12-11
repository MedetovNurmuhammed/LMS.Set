package model;

public class IdStudents {
    private static long counter = 0;
    public static long geneteId(){
        return ++counter;
    }

}
