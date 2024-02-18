package com.teachmeskills.lesson13.task1.dataChecking;

import com.teachmeskills.lesson13.task1.constants.iConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Checking whether the password and login match
 */
public class Checking implements iConstants {
    public static boolean checkingLogin(String login) {
        Pattern ptLogin = Pattern.compile(log);
        Matcher matLogin = ptLogin.matcher(login);
        if (!matLogin.find()) {
            return false;
        }
        return true;
    }

    public static boolean checkingPassword(String password, String confirmPassword) {
        Pattern ptPassworrd = Pattern.compile(pas);
        Matcher matPassword = ptPassworrd.matcher(password);
        boolean con = password.matches(".*\\d.*");
        if(!con){
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
