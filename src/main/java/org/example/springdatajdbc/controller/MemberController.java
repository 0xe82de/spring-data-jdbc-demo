package org.example.springdatajdbc.controller;

import lombok.RequiredArgsConstructor;
import org.example.springdatajdbc.entity.Member;
import org.example.springdatajdbc.service.MemberDto;
import org.example.springdatajdbc.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public Long addMember(@RequestBody MemberDto memberDto) {
        return memberService.addMember(memberDto.toEntity());
    }

    @GetMapping
    public List<Member> findMembers(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            return memberService.findAll();
        }

        return memberService.findByName(name);
    }

    @GetMapping("/{seq}")
    public Member findBySeq(@PathVariable Long seq) {
        return memberService.findBySeq(seq);
    }
}
