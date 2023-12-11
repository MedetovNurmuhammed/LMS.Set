import database.Database;
import model.*;
import services.GroupService;
import services.LessonService;
import services.StudentService;
import services.UserService;
import services.impl.GroupImpl;
import services.impl.LessonImpl;
import services.impl.StudentsImpl;
import services.impl.UserServiceImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User();
        LessonService lessonService = new LessonImpl();
        UserService userService = new UserServiceImpl();
        GroupService groupService = new GroupImpl();
        Database database = new Database();
        StudentService studentService = new StudentsImpl();
        boolean isT = false;
        LocalDateTime localDateTime = LocalDateTime.now();
        int hour = localDateTime.getHour();
        int min = localDateTime.getMinute();
        if (hour<11){
            System.out.println("Доброе утро!");
        }else if (hour>11&&hour<18){
            System.out.println("Добрый день!");
        }
        else {
            System.out.println("Добрый вечер!");
        }
        System.out.println("Саат: "+hour+":"+min);


         while (true){ System.out.println("""
                    Катталган болсонуз 1 басыныз, Пароль унутуп калып, озгортуу учун 2 басыныз! 
                    эл.почта = 1111;
                    пароль = 1111;
                    Команда танданыз:
                    """);
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();

            switch (a) {
                case "1" -> {
                    User user1 = userService.Voiti(user);
                    Scanner scanner1 = new Scanner(System.in);
                   if (user1!=null){

                    while (true) {
                        System.out.println("""
                                1 -> Add new group
                                2 -> Get group by name
                                3 -> Update group name
                                4 -> Get all groups
                                5 -> Add new student to group
                                6 -> Update student name
                                7 -> Find student by firstname
                                8 -> Get all students by group name
                                9 -> Get all students lesson
                                10-> Delete student by email
                                11 ->Add lesson by Groupnamename
                                12 -> Get all lesson by  name
                                13 -> Get all lesson by group name
                                14 -> delete lesson by id
                                Выберите команду:""");
                        switch (scanner1.nextLine()) {
                            case "1" -> {
                                Group group = new Group();
                                groupService.AddNewGroup(group);
                            }
                            case "2" -> {
                                groupService.getGroupByName(Database.groups);

                            }
                            case "3" -> {
                                groupService.UpdateGroupName(Database.groups);
                            }
                            case "4" -> {
                                groupService.Getallgroups();
                            }
                            case "5" -> {
                                System.out.println("В какую группу добавить:");
                                Scanner scanner2 = new Scanner(System.in);
                                String namegroup = scanner2.nextLine();
                                studentService.AddnewStudent(namegroup);


                            }
                            case "6" ->{
                                studentService.UpdateStudentName();

                            }
                            case "7" ->{
                                studentService.FindStudentName();
                            }
                            case "8" ->{
                                groupService.GetallStByGrName(database.groups);
                            }
                            case "9" ->{
                                lessonService.getallstLesson(Database.groups);
                            }
                            case "10" ->{
                                System.out.println("Введите Email студента:");
                                String email = new Scanner(System.in).nextLine();
                                studentService.deletestudentbyEmail(email);
                            }
                            case "11"->{
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Введите имя группы:");
                                String groupname = scanner2.nextLine();
                                System.out.println("Введите названия Lesson:");
                                String name = scanner2.nextLine();
                                System.out.println("Введите Тему урока:");
                                String disk = scanner2.nextLine();
                                lessonService.addlessonbygroupname(groupname,name,disk);
                            }
                            case "12"->{
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Введите названия урока:");
                                String lessoname = scanner3.nextLine();
                                lessonService.getalllessonbyname(lessoname);
                            }
                            case "13"->{
                                System.out.println("Введите название группы:");
                                String name = new Scanner(System.in).nextLine();
                                lessonService.getalllessonbygroupname(name);
                            }case "14"->{
                                System.out.println("Введите id lesson которое хотите удалить:");
                            try {
                                long id = new Scanner(System.in).nextLong();
                                lessonService.deletelessonbyid(id);
                            }catch (InputMismatchException e) {
                                System.err.println("Туура аргумент бер!");
                            };
                            }

                        }
                    }}
                }
                case "2" -> {
                    userService.izmenitParol(user);

                }


            }
        }}
    }
