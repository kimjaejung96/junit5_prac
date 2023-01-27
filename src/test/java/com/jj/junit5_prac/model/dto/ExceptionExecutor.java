package com.jj.junit5_prac.model.dto;

public class ExceptionExecutor {
    public static void generateException () throws IllegalAccessException {
        throw new IllegalAccessException("Exception 발생");
    }
}
