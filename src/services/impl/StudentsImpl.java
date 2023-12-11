package services.impl;

import com.sun.jdi.ArrayReference;
import database.Database;
import model.Group;
import model.IdStudents;
import model.Students;
import model.enums.Gender;
import services.StudentService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import static database.Database.groups;

public class StudentsImpl implements StudentService {
    @Override
    public void AddnewStudent(String namegroup) {
        Students students = new Students();
        Scanner scanner = new Scanner(System.in);
        if (groups.size() > 0) {
            for (int i = 0; i < Database.groups.size(); i++) {
                if (namegroup.equalsIgnoreCase(groups.get(i).getGroupName())) {
                    students.setStudentId(IdStudents.geneteId());
                    System.out.println("Введите имя:");
                    students.setStudentsName(scanner.nextLine());
                    System.out.println("Введите фамилию:");
                    students.setStudentsLastname(scanner.nextLine());
                    System.out.println("Введите адресс эл.почты:");
                    students.setStudentsEmail(scanner.nextLine());
                    if (!students.getStudentsEmail().isEmpty()&& students.getStudentsEmail().contains("@gmail.com") ){
                        System.out.println("Создайте пароль эл.почты:");
                        students.setStudentsPassword(scanner.nextLine());
                    System.out.println("Введите пол: M or F");
                    String gender = scanner.nextLine();
                    if (gender.equalsIgnoreCase("m")) {
                        students.setStudentsGenader(Gender.MALE);
                    } else if (gender.equalsIgnoreCase("F")) {
                        students.setStudentsGenader(Gender.FEMAIL);
                    }

                }  else {
                        System.out.println("Поля не должны быть пустыми и почта должен содержать @gmail.com");

            }
               groups.get(i).students.add(students);
                    System.out.println(groups.get(i).students);




            System.out.println("Студент успешно добавлен в группу!");

        } else {
            System.out.println("Такой группы не существует!");


        }

    }}}

    @Override
    public void UpdateStudentName() {
        if (groups.size()>0){
            System.out.println("Введите имя студента которое хотите изменить:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            for (int i = 0; i < groups.size(); i++) {
                for (int j = 0; j < groups.get(i).students.size(); j++) {
                if (name.equalsIgnoreCase(groups.get(i).students.get(j).getStudentsName())){
                    System.out.println("Введите новое имя:");
                    String a  = scanner.nextLine();
                    groups.get(i).students.get(j).setStudentsName(a);
                    System.out.println("Имя студента успешно изменен!");
                    System.out.println(groups.get(i).students);
                }
                else {
                    System.out.println("Студент с таким именем не существует!");
                }

            }

            }}else {
            System.out.println("Студентов пока нет!");
        }

    }

    @Override
    public void FindStudentName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента:");
        String name = scanner.nextLine();
        for (int i = 0; i < groups.size(); i++) {
            for (int j = 0; j < groups.get(i).students.size(); j++) {
                if (name.equals(groups.get(i).students.get(j).getStudentsName())){
                    groups.get(i).students.get(j).setStudentsName(name);
                    System.out.println(groups.get(i).students.get(j));
                }else {
                    System.out.println("Студент с таким именем не существует!");
                }

            }

        }

    }

    @Override
    public void deletestudentbyEmail(String email) {
        for (int i = 0; i < groups.size(); i++) {
            for (int j = 0; j < groups.size(); j++) {
                if (email.equalsIgnoreCase(groups.get(i).students.get(j).getStudentsEmail())){
                    groups.get(i).students.remove(j);
                    System.out.println(groups.get(i));
                    System.out.println("Студент успешно удален!");
                return;}}}

                    System.out.println("Студент не найден!");
                }

        }

