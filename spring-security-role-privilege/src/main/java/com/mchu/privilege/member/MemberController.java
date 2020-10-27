package com.mchu.privilege.member;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@PreAuthorize("hasScope('members')")
public class MemberController {

    private final MemberRepositories memberRepositories;

    public MemberController(MemberRepositories memberRepositories) {
        this.memberRepositories = memberRepositories;
    }

    @GetMapping("/members")
    public List<Member> getAllMember() {
        return this.memberRepositories.findAll();
    }
}
