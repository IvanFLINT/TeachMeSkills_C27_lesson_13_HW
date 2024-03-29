package com.teachmeskills.lesson13.task1.dataChecking;

import com.teachmeskills.lesson13.task1.constants.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Checking whether the password and login match
 */
public class Checking {
    public static boolean checkingLogin(String login) {
        Pattern ptLogin = Pattern.compile(Constants.LOGIN);
        Matcher matLogin = ptLogin.matcher(login);
        boolean log = login.matches("[а-яёА-ЯЁ]+");
        if (log) {
            System.out.println("В login должны быть латинские бувы");
            return false;
        }
        if (!matLogin.find()) {
            return false;
        }
        return true;
    }

    public static boolean checkingPassword(String password, String confirmPassword) {
        Pattern ptPassworrd = Pattern.compile(Constants.PASSWORD);
        Matcher matPassword = ptPassworrd.matcher(password);
        boolean pass1 = password.matches("[а-яёА-ЯЁ]+");
        if (pass1) {
            System.out.println("В пароле должны быть латинские бувы");
            return false;
        }
        boolean pass2 = password.matches(".*\\d.*");
        if (!pass2) {
            System.out.println("В поролле должна быть хотя бы одна цифра");
            return false;
        }
        if (!matPassword.find()) {
            return false;
        }
        if (!password.equals(confirmPassword)) {
            System.out.println("Пароли не совпадают");
            return false;
        }
        return true;
    }
}
