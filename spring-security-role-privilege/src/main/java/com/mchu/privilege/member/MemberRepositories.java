package com.mchu.privilege.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;

import java.util.List;

public interface MemberRepositories extends JpaRepository<Member,Long> {

    @Override
    @PostFilter("filterObject.career == 'Billionaire' or hasAuthority('WRITE_PRIVILEGE')")
    List<Member> findAll();

}
