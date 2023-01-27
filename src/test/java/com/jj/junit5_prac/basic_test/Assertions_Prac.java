package com.jj.junit5_prac.basic_test;
import com.jj.junit5_prac.model.dto.Calculator;
import com.jj.junit5_prac.model.dto.ExceptionExecutor;
import com.jj.junit5_prac.model.dto.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Assertions_Prac {
    @Test
    void Assertions_기초1() {
        assertEquals(2, new Calculator().add(1,1));
        assertEquals(4, new Calculator().multiply(2,2), "실패시 메세지");
        assertTrue(1 != 2, () -> "Assertion Message는 지연로딩과 비슷하게 동작.");
    }
    @Test
    void Assertions_기초2() {
        assertEquals(4, new Calculator().multiply(2,2), "실패시 메세지");
    }
    @Test
    void Assertions_기초3() {
        assertTrue(1 == 2, () -> "Assertion Message는 지연로딩과 비슷하게 동작.");
    }
    @Test
    void Assertions_그룹1_성공() {
        Person person = new Person("김","재중");
        assertAll("person",
                () -> assertEquals("재중", person.getLastName()),
                () -> assertEquals("김", person.getFirstName())
        );
    }
    @Test
    void Assertions_그룹1_실패() {
        Person person = new Person("김","재중");
        assertAll("person",
                () -> assertEquals("재중", person.getLastName()),
                () -> assertEquals("박", person.getFirstName())
        );
    }

    @Test
    void Assertions_Exception_1() {
        Exception exception = assertThrows(IllegalAccessException.class,
                () -> ExceptionExecutor.generateException()
        );
        assertEquals("Exception 발생", exception.getMessage());
    }

    @Test
    void Assertions_Timeout_1() {
        String result = assertTimeout(Duration.ofSeconds(5), () -> {
            Thread.sleep(1000);
            System.out.println("5초 이내에 해결되는 메소드");
            return "success";
        });
        assertEquals(result, "success");
    }

    //fail뜸
    @Test
    void Assertions_Timeout_2() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            System.out.println("2초 넘어가는 메서드");
            Thread.sleep(2500);
        });
    }
}
