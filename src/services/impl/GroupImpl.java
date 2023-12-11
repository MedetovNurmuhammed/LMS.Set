package services.impl;

import database.Database;
import model.Group;
import model.IdGroup;
import model.User;
import services.GroupService;
import services.UserService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class GroupImpl implements GroupService {


    @Override
    public void Getallgroups() {
        System.out.println(Database.groups);
        }


    @Override
    public void AddNewGroup(Group newgroup) {
        Scanner scanner = new Scanner(System.in);

        newgroup.setGroupId(IdGroup.geneteId());
        System.out.println("Введите имя Группы:");
        newgroup.setGroupName(scanner.nextLine());
        System.out.println("Введите направление:");
        newgroup.setDiscription(scanner.nextLine());
        Database.groups.add(newgroup);
        System.out.println(Database.groups);

    }



    @Override
    public void getGroupByName(LinkedList<Group>groups) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя группы:");
        String a = scanner.nextLine();
        for (int i = 0; i < groups.size(); i++) {
            if (a.equalsIgnoreCase(Database.groups.get(i).getGroupName())){
                System.out.println(Database.groups.get(i));
            }
            else {
                System.out.println("Такой группы не существует!");

            }

        }

    }

    @Override
    public void UpdateGroupName(LinkedList<Group>groups) {
        System.out.println("Введите  имя группы которое хотите изменить: ");
        String a  = new Scanner(System.in).nextLine();
        for (int i = 0; i < Database.groups.size(); i++) {
            if (a.equalsIgnoreCase(Database.groups.get(i).getGroupName())){
                System.out.println("Введите новое имя: ");
                String b = new Scanner(System.in).nextLine();
                Database.groups.get(i).setGroupName(b);
                System.out.println("Имя группы успешно изменен!");
                System.out.println(Database.groups.get(i));
            }
            else {
                System.out.println("Такой группы не существует!");
            }

        }
    }

    @Override
    public void GetallStByGrName(LinkedList<Group>groups) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя группы:");
        String a = scanner.nextLine();
        for (int i = 0; i < groups.size(); i++) {
            if (a.equalsIgnoreCase(Database.groups.get(i).getGroupName())) {
                System.out.println(groups.get(i).students);
            }
        }
                System.out.println("Такой группы не существует!");

            }

        }


