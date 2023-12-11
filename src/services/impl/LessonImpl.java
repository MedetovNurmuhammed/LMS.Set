package services.impl;

import database.Database;
import model.Group;
import model.LessonId;
import model.Lessons;
import services.LessonService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LessonImpl implements LessonService {
    @Override
    public void getallstLesson(LinkedList<Group>groups) {

        System.out.println("Имя студента:");
String name = new Scanner(System.in).nextLine();
        for (int i = 0; i < Database.groups.size(); i++) {
        for (int j = 0; j< Database.groups.size(); j++) {
            if (name.equalsIgnoreCase(Database.groups.get(i).students.get(j).getStudentsName())){
                System.out.println(Database.groups.get(i).students.get(j));
                return;
            }}}

                System.out.println("Студент не найден!");
            }

    @Override
    public void addlessonbygroupname(String groupname,String lesson,String diskriptin) {
        for (int i = 0; i < Database.groups.size(); i++) {
            if (groupname.equalsIgnoreCase(Database.groups.get(i).getGroupName())){
                Lessons lessons = new Lessons();
                lessons.setLessonId(LessonId.geneteId());
                lessons.setLessonNAme(lesson);
                lessons.setTaskDiscription(diskriptin);
                LinkedList<Lessons>lessons1 = new LinkedList<>(Arrays.asList(lessons));
                Database.groups.get(i).lessons.add(lessons1);
                System.out.println(Database.groups.get(i).lessons);
                System.out.println("Успешно добавлен!");
                return;
            }

        }
        System.out.println("Группа не найден!");
    }

    @Override
    public void getalllessonbyname(String lessoname) {
        for (int i = 0; i < Database.groups.size(); i++) {
        for (int j = 0; j < Database.groups.size(); j++) {
            if (lessoname.equalsIgnoreCase(Database.groups.get(i).lessons.get(j).element().getLessonNAme())){
                System.out.println(Database.groups.get(i).lessons.get(j));
            }
        }
    }

}

    @Override
    public void getalllessonbygroupname(String groupname) {
        for (int i = 0; i < Database.groups.size(); i++) {
            if (groupname.equalsIgnoreCase(Database.groups.get(i).getGroupName())){
                System.out.println(Database.groups.get(i).lessons);
                return;
            }

        }
        System.out.println("Группа не найден!");
    }

    @Override
    public void deletelessonbyid(long id) {
        for (int i = 0; i < Database.groups.size(); i++) {
        for (int j = 0; j < Database.groups.size(); j++) {
            if (id==Database.groups.get(i).lessons.get(j).element().getLessonId()){
                Database.groups.get(i).lessons.remove(j);
                System.out.println(Database.groups.get(i).lessons);
                System.out.println("Успешно удален!");
                return;
            }
        }
    }
        System.out.println("Lesson не найден!");}}



