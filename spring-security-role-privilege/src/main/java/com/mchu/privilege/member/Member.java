package com.mchu.privilege.member;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String career;

}
