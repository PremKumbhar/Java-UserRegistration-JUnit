package com.bridgelabz;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationInput userRegistrationInput = new UserRegistrationInput();

    @Test
    public void givenValidFirstName_shouldReturnTrue() {
        boolean result = userRegistrationInput.isFirstNameValid("Prem");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidFirstName_shouldReturnFalse() {
        boolean result = userRegistrationInput.isFirstNameValid("prem");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidLastName_shouldReturnTrue() {
        boolean result = userRegistrationInput.isLastNameValid("Kumbhar");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        boolean result = userRegistrationInput.isFirstNameValid("kumbhar");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidEmail_shouldReturnTrue() {
        boolean result = userRegistrationInput.isEmailValid("premk123@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        boolean result = userRegistrationInput.isEmailValid("premk123gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidMobileNumber_shouldReturnTrue() {
        boolean result = userRegistrationInput.isMobileNumberValid("7350447788");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidMobileNumber_shouldReturnFalse() {
        boolean result = userRegistrationInput.isMobileNumberValid("73504477");
        Assert.assertFalse(result);
    }

    @Test
    public void givenValidPassword_shouldReturnTrue() {
        boolean result = userRegistrationInput.isPasswordValid("Prem@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenInvalidPassword_shouldReturnFalse() {
        boolean result = userRegistrationInput.isPasswordValid("prem123");
        Assert.assertFalse(result);
    }
}
