package org.example.springdatajdbc.service;

import lombok.RequiredArgsConstructor;
import org.example.springdatajdbc.entity.Member;
import org.example.springdatajdbc.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Long addMember(Member member) {
        Member savedMember = memberRepository.save(member);
        return savedMember.getSeq();
    }

    public Member findBySeq(Long seq) {
        return memberRepository.findBySeq(seq)
                .orElseThrow(() -> new IllegalArgumentException("Not found member with seq: " + seq));
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public List<Member> findByName(String name) {
        return memberRepository.findByName(name);
    }
}
