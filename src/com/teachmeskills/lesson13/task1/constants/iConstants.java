package com.teachmeskills.lesson13.task1.constants;

/**
 * Regular expressions login and password
 */
public interface iConstants {
    String log = "^[a-zA-Z0-9._-]{5,20}$";
    String pas = "^(?=.*[0-9])[a-zA-Z](?=\\S+$).{5,20}$";
}
