package services.impl;

import database.Database;
import model.User;
import services.UserService;

import java.util.Objects;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    Database database = new Database();



    @Override
    public User Voiti(User newUser) {
        Scanner scanner = new Scanner(System.in);

       newUser.setId(1);
        newUser.setFirstname("Peaksof");
        newUser.setLastname("House");

        System.out.println("Введите адрес эл. почты:");
        String email = scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();


        if (email.equalsIgnoreCase(newUser.getEmail()) && password.equals(newUser.getPassword())) {
            System.out.println("Добро пожаловать!");
            return newUser;

        } else {

            System.out.println("Похоже, вы ввели неверный адрес эл. почты или пароль!");
        }return null;

    }
    @Override
    public void izmenitParol(User newUser) {
        System.out.println("Введите ардесс эл.почты:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        if (email.equalsIgnoreCase(newUser.getEmail())){
            System.out.println("Введите новый пароль!");
            String password = scanner.nextLine();
            newUser.setPassword(password);
            System.out.println("Пароль успешно изменен!");
        System.out.println(newUser);
        }
        else {
            System.out.println("Пользователь не найден!");


        }

    }


}

