package com.teachmeskills.lesson13.task1.constants;

/**
 * Regular expressions login and password
 */
public interface Constants {
    public String LOGIN = "^[a-zA-Z0-9._-]{5,20}$";
    public String PASSWORD = "^(?=.*[0-9])[a-zA-Z](?=\\S+$).{5,20}$";
}
