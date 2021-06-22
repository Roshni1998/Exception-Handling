package com.bridgelabz.regex;

import java.util.regex.Pattern;
/**
 * @author ROSHNI
 * User Registration Problem
 */

public class UserValidator {

    /*UC-1*/
    //First name starts with Cap and has minimum 3 characters
    public String isValidFirstName(String fname) throws RegistrationException {
        /**
         * @param firstName
         * @return boolean
         */
        String regex = "^[A-Z][a-z]{3,15}$";
        try {
            if (fname.matches(regex) == true)
                return "HAPPY";
            else
                return "SAD";
        }catch (NullPointerException e){
            throw new RegistrationException("Please Enter valid First Name");
        }
    }
    /*UC-2*/
    // Last name starts with Cap and has minimum 3 characters
    public String isValidLastName(String lname) throws RegistrationException {
        /**
         *
         * @param lastName
         * @return boolean
         */
        String regex = "^[A-Z][a-z]{3,15}$";
        try {
            if (lname.matches(regex) == true)
                return "HAPPY";
            else
                return "SAD";
        }catch (NullPointerException e){
            throw new RegistrationException("Please Enter valid Last Name");
        }
    }
    /*UC-3*/
    //Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public String isValidEmailId(String emailId) throws RegistrationException {
        /**
         *
         * @param emailId
         * @return boolean
         */
        String regex = "^[a-zA-Z0-9]+([.+-_][0-9a-zA-Z]+)*"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}+([.][a-zA-Z]{0,2})?$";
        try {
            if (emailId.matches(regex) == true)
                return "HAPPY";
            else
                return "SAD";
        }catch(NullPointerException e){
            throw  new RegistrationException("Please Enter Valid Email Id");
        }

    }
    /*UC-4*/
    //Country code follow by space and 10 digit number
    public String isValidMobileNo(String mobileNo) throws RegistrationException {
        /**
         *
         * @param mobileNo
         * @return boolean
         */
        String regex = "(0|91)?\\s([7-9][0-9]{9})";
        try {
            if (mobileNo.matches(regex) == true)
                return "HAPPY";
            else
                return "SAD";
        }catch(NullPointerException e){
            throw  new RegistrationException("Please Enter Valid Mobile Number");
        }
    }
    /*UC-5, UC-6, UC-7, UC-8*/
    /* Password should contain minimum 8 Characters
     * Password should have at least 1 Upper Case
     * Password should have at least 1 numeric number
     * Should have exactly 1 Special Character
     */
    public String isValidPassword(String password) throws RegistrationException {
        /**
         * @param password
         * @return boolean
         */
        String regex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,12}$";
        try {
            if (password.matches(regex) == true)
                return "HAPPY";
            else
                return "SAD";
        }catch(NullPointerException e){
            throw new RegistrationException("Please Enter Valid Password");
        }
    }
}