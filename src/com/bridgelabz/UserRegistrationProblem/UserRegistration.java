package com.bridgelabz.UserRegistrationProblem;
import java.util.regex.*;
public class UserRegistration {
    public void nameCheck(String fn) {
        Pattern p1 = Pattern.compile("[A-Z][a-zA-Z]{3,}");  //In first name first letter starts with capital and second letter can start with any alphabet(case insensitive) and first name must contain atleast 3 characters
        Matcher m1 = p1.matcher(fn);

        if (m1.matches()) {
            System.out.println("It is a valid first name");  //To check for validity of first name
        } else {
            System.out.println("Invalid first name!");
        }


}}

