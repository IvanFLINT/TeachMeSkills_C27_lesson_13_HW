package com.teachmeskills.lesson13.task1.service;

import com.teachmeskills.lesson13.task1.exception.ExceptionMetod;
import com.teachmeskills.lesson13.task1.exception.WrongLoginException;
import com.teachmeskills.lesson13.task1.exception.WrongPasswordException;

/**
 * Exception class
 */
public class Service {
    public static void service(String login, String password, String confirmPassword) {
        try {
            ExceptionMetod.loginPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("WrongLoginException");
        } catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException");
        }
    }
}
