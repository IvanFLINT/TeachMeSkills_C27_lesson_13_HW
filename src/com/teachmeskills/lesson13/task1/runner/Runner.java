package com.teachmeskills.lesson13.task1.runner;

import com.teachmeskills.lesson13.task1.service.Service;

import java.util.Scanner;
/**
 * The Runner class requests login and password information
 */
public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите логин от 5 до 20 символов: ");
        String login = sc.nextLine();
        System.out.print("Введите пароль от 5 до 20 символов: ");
        String password = sc.nextLine();
        System.out.print("Подтвердите пароль: ");
        String confirmPassword = sc.nextLine();
        Service.service(login, password, confirmPassword);
        sc.close();
    }
}
