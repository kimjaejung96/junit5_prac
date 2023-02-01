package com.jj.junit5_prac.controller;


import com.jj.junit5_prac.model.dto.Member;
import com.jj.junit5_prac.service.HelloService;
import com.jj.junit5_prac.service.impl.HelloServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return "hi";
    }
    @PostMapping("/sign-up")
    public Member signUp(Member member) {
        return helloService.signUp(member);
    }
}
