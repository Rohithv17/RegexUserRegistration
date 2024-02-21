package com.bridgelabz.userregistrationproblem;

import java.util.regex.*;
public class UserRegistration {
    public void emailCheck(String emailid) {  // function to check user's email id
    Pattern email = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");  // The regular expression pattern checks for the presence of mandatory parts (abc, bl, and co) and optional parts (xyz and in), with precise '@' and '.'
    Matcher m = email.matcher(emailid);
   if(m.matches()){
        System.out.println("It is a valid email id");  //To check for validity of email id
    }
    else {
        System.out.println("Invalid email id!");
    }

}}
