package com.jj.junit5_prac.infra;

import com.jj.junit5_prac.model.dto.Member;
import org.springframework.stereotype.Component;

@Component
public class HelloInfra {
    public String getName(Member member) {
        return member.getName();
    }
}
