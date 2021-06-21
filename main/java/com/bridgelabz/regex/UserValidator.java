package com.bridgelabz.regex;

import java.util.regex.Pattern;
/**
 * @author ROSHNI
 * User Registration Problem
 */

public class UserValidator {

    /*UC-1*/
    //First name starts with Cap and has minimum 3 characters
    public String isValidFirstName(String fname) {
        /**
         * @param firstName
         * @return boolean
         */
        String regex = "^[A-Z][a-z]{3,15}$";
        if (fname.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
    }

    /*UC-2*/
    // Last name starts with Cap and has minimum 3 characters
    public String isValidLastName(String lname) {
        /**
         *
         * @param lastName
         * @return boolean
         */
        String regex = "^[A-Z][a-z]{3,15}$";
        if (lname.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
    }
//    /*UC-3*/
//    //Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public String isValidEmailId(String emailId) {
        /**
         *
         * @param emailId
         * @return boolean
         */
        String regex = "^[a-zA-Z0-9]+([.+-_][0-9a-zA-Z]+)*"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}+([.][a-zA-Z]{0,2})?$";
        if (emailId.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
    }
//    /*UC-4*/
//    //Country code follow by space and 10 digit number
    /**
     *
     * @param mobileNo
     * @return boolean
     */
    public String isValidMobileNo(String mobileNo) {
        String regex = "(0|91)?\\s([7-9][0-9]{9})";
        if (mobileNo.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
    }
//    /*UC-5, UC-6, UC-7, UC-8*/
    /* Password should contain minimum 8 Characters
     * Password should have at least 1 Upper Case
     * Password should have at least 1 numeric number
     * Should have exactly 1 Special Character
     */
    /**
     * @param password
     * @return boolean
     */
    public String isValidPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,12}$";
        if (password.matches(regex) == true)
            return "HAPPY";
        else
            return "SAD";
    }
}