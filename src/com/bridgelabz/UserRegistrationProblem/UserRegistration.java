package com.bridgelabz.UserRegistrationProblem;
import java.util.regex.*;
public class UserRegistration {
    public void nameCheck(String fn,String ln) {
        Pattern p1 = Pattern.compile("[A-Z][a-zA-Z]{3,}");  //In name first letter starts with capital and second letter can start with any alphabet(case insensitive) and first name must contain atleast 3 characters
        Matcher m1 = p1.matcher(fn);

        Pattern p2= Pattern.compile("[A-Z][a-zA-Z]{3,}");  //In last name first letter starts with capital and second letter can start with any alphabet(case insensitive) and first name must contain atleast 3 characters
        Matcher m2 = p2.matcher(ln);

        if (m1.matches()) {
            System.out.println("It is a valid first name");  //To check for validity of first name
        } else {
            System.out.println("Invalid first name!");
        }


        if (m2.matches()) {
            System.out.println("It is a valid last name");  //To check for validity of last  name
        } else {
            System.out.println("Invalid last name!");
        }


}}

