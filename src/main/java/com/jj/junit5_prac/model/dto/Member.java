package com.jj.junit5_prac.model.dto;

import lombok.Getter;

@Getter
public class Member {
    private final String name;
    private final String email;
    private final String address;

    public Member(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
