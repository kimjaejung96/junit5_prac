package com.jj.junit5_prac.service.impl;

import com.jj.junit5_prac.model.dto.Member;
import com.jj.junit5_prac.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public Member signUp(Member member) {
        //로직
        return member;
    }
}
