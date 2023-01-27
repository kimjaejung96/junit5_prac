package com.jj.junit5_prac.basic_test;

import com.jj.junit5_prac.annotaion.DevTagTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Basic1 {

    @DevTagTest
    @DisplayName("더하기 + DisplayName 테스트")
    void addTest() {
        assertEquals(2, new Calculator().add(1,1));
    }
    public static class Calculator {
        public Integer add(Integer a, Integer b) {
            return a + b;
        }
    }
}
