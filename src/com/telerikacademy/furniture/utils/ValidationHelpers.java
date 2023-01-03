package com.telerikacademy.furniture.utils;

public class ValidationHelpers {

    public static final String STR_LENGTH_ERROR_MESSAGE = "Minimum number of characters is %d";
    public static final String NUMBER_ERROR_MESSAGE = "Number can not be 0 or negative";

    public static void validateStringMinLength(String strToValidate, int minLength){
        if(strToValidate.length() < minLength || strToValidate == null){
            throw new IllegalArgumentException(String.format(STR_LENGTH_ERROR_MESSAGE, minLength));
        }
    }

    public static void validateGraterThanZero(double value){
        if(value <= 0){
            throw new IllegalArgumentException(NUMBER_ERROR_MESSAGE);
        }
    }
}
