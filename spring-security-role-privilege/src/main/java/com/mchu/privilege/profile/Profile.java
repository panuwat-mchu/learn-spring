package com.mchu.privilege.profile;

import com.mchu.privilege.user.User;
import lombok.Data;

import javax.persistence.*;

//@Data
//@Entity
//@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private User account;

}
