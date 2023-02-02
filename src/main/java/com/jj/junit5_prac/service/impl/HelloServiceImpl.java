package com.jj.junit5_prac.service.impl;

import com.jj.junit5_prac.infra.HelloInfra;
import com.jj.junit5_prac.model.dto.Member;
import com.jj.junit5_prac.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {
    private final HelloInfra helloInfra;
    @Override
    public Member signUp(Member member) {
        //로직
        return member;
    }

    @Override
    public String getName(Member member) {
        return helloInfra.getName(member);
    }
}
