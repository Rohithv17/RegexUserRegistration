package com.bridgelabz.userregistrationproblem;

import java.util.regex.*;
public class UserRegistration {
    public void emailPasswordCheck(String emailid,String passwd) {  // function to check user's email id
    Pattern email = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");  // The regular expression pattern checks for the presence of mandatory parts (abc, bl, and co) and optional parts (xyz and in), with precise '@' and '.'
    Matcher m = email.matcher(emailid);
    if(m.matches()){
        System.out.println("It is a valid email id");  //To check for validity of email id
    }
    else {
        System.out.println("Invalid email id!");
    }

    Pattern passwordPattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9]).{8,}"); // conditions for valid password(should contain atleast 1 numeric character)
    Matcher matcher = passwordPattern.matcher(passwd);

        if(matcher.matches()){
            System.out.println("It is a valid password ");  //To check for validity of password
        }
        else {
            System.out.println("Invalid password");
        }

}}

