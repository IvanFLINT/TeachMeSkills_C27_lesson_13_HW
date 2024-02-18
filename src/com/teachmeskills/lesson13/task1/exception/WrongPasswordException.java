package com.teachmeskills.lesson13.task1.exception;

/**
 * Extending WrongPasswordException class from Exception class
 */
public class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }
}
