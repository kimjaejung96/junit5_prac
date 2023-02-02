package com.jj.junit5_prac.service.impl;

import com.jj.junit5_prac.infra.HelloInfra;
import com.jj.junit5_prac.model.dto.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) //mock으로 선언된 녀석들을 바인딩 시켜줌.  == Mockito.mock(~~.class)
class HelloServiceImplTest {
    @Mock
    HelloInfra helloInfra;

    @InjectMocks //mock으로 선언된 녀석들을 사용하여 자신을 생성함.
    HelloServiceImpl helloService;


    @Test
    @DisplayName("BDD - Behavior Driven Development")
    void signUp() {
        //given
        Member member = new Member("김재중", "kimjaejung96@gmail.com", "인천ㅋㅋ");
        when(helloInfra .getName(member))
                .thenReturn(member.getName());
        //when
        String returnedName = helloService.getName(member);;

        //then
        assertEquals(member.getName(), returnedName);
        then(helloInfra).should(times(1)).getName(member);

    }

    @Test
    void getName() {
    }
}
