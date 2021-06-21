package com.bridgelabz.regex;

import java.util.regex.Pattern;
/**
 * @author ROSHNI
 * User Registration Problem
 */

public class UserValidator {

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([.+-_][0-9a-zA-Z]+)*"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z]{2,4}+([.][a-zA-Z]{0,3})?$";

    /*UC-9*/
    //Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public boolean isValidEmailId(String emailId) {
        /**
         *
         * @param emailId
         * @return boolean
         */
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailId). matches();
    }
}