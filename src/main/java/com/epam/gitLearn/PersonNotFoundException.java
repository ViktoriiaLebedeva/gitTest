package com.epam.gitLearn;

public class PersonNotFoundException extends RuntimeException{

    public PersonNotFoundException(String message) {
        super(message);
    }

}
