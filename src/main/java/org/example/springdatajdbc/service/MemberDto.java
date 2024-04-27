package org.example.springdatajdbc.service;

import lombok.RequiredArgsConstructor;
import org.example.springdatajdbc.entity.Member;

@RequiredArgsConstructor
public class MemberDto {

    private final String name;

    private final int age;

    public Member toEntity() {
        return new Member(null, name, age);
    }
}
