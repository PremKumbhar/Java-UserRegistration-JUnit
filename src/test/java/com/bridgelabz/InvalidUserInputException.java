package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class InvalidUserInputException extends Exception{
    UserRegistrationInput userRegistration = new UserRegistrationInput();
    @Test
    public void givenValidFirstName_shouldReturnTrue(){
        try {
            boolean result = userRegistration.isFirstNameValid("Prem");
            Assert.assertTrue(result);
        }catch (Exception e){
            System.out.println("Catch Block");
        }
    }
    @Test
    public void givenValidFirstName_shouldReturnFalse(){
        try {
            boolean result = userRegistration.isFirstNameValid("prem");
            Assert.assertFalse(result);
        }catch (Exception e){
            System.out.println("Catch Block");
        }
    }
    @Test
    public void givenValidLastName_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isLastNameValid("Kumbhar");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isFirstNameValid("kumbhar");
            Assert.assertFalse(result);
        } catch (Exception e) {

        }
    }


    @Test
    public void givenValidEmail_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isEmailValid("premk123@gmail.com");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isEmailValid("premk123gmail.com");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenValidMobileNumber_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isMobileNumberValid("7350447788");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidMobileNumber_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isMobileNumberValid("73504477");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenValidPassword_shouldReturnTrue() {
        try {
            boolean result = userRegistration.isPasswordValid("Prem@123");
            Assert.assertTrue(result);
        }catch (Exception e){

        }
    }

    @Test
    public void givenInvalidPassword_shouldReturnFalse() {
        try {
            boolean result = userRegistration.isPasswordValid("prem123");
            Assert.assertFalse(result);
        }catch (Exception e){

        }
    }
}
