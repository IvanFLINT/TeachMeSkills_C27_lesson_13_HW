package com.teachmeskills.lesson13.task1.exception;

import com.teachmeskills.lesson13.task1.constants.iConstants;
import com.teachmeskills.lesson13.task1.dataChecking.Checking;

/**
 * The class contains the loginPassword method for working with exceptions
 */
public class ExceptionMetod {
    public static boolean loginPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (!Checking.checkingLogin(login)) {
            throw new WrongLoginException("WrongLoginException");
        }
        if (!Checking.checkingPassword(password, confirmPassword)) {
            throw new WrongPasswordException("WrongPasswordException");
        }
        return true;
    }
}
