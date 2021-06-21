package com.bridgelabz.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        UserValidator valid = new UserValidator();
        String fname = valid.isValidFirstName("Roshni");
        Assertions.assertEquals("HAPPY", fname);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnSad(){
        UserValidator valid = new UserValidator();
        String fname = valid.isValidFirstName("Ro");
        Assertions.assertEquals("SAD", fname);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy(){
        UserValidator valid = new UserValidator();
        String lname = valid.isValidLastName("Mali");
        Assertions.assertEquals("HAPPY", lname);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnSad(){
        UserValidator valid = new UserValidator();
        String lname = valid.isValidLastName("ma");
        Assertions.assertEquals("SAD", lname);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnHappy(){
        UserValidator valid = new UserValidator();
        String emailId = valid.isValidEmailId("roshni1234@gmail.com");
        Assertions.assertEquals("HAPPY", emailId);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnSad(){
        UserValidator valid = new UserValidator();
        String emailId = valid.isValidEmailId("roshni1234@gmail.com.innnn");
        Assertions.assertEquals("SAD", emailId);
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldReturnHappy(){
        UserValidator valid = new UserValidator();
        String mobileNo = valid.isValidMobileNo("91 9999888767");
        Assertions.assertEquals("HAPPY", mobileNo);
    }

    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnSad(){
        UserValidator valid = new UserValidator();
        String mobileNo = valid.isValidMobileNo("919999888767");
        Assertions.assertEquals("SAD", mobileNo);
    }

    @Test
    public void givenPasswordShouldHaveAtLeastOne_SpecialCharacter_ThenReturnHappy(){
        UserValidator valid = new UserValidator();
        String password = valid.isValidPassword("A@cdEfg8");
        Assertions.assertEquals("HAPPY", password);
    }

    @Test
    public void givenPasswordShouldHaveAtLeastOne_SpecialCharacter_OtherwiseReturnSad(){
        UserValidator valid = new UserValidator();
        String password = valid.isValidPassword("ABcdef123");
        Assertions.assertEquals("SAD", password);
    }

}