package com.axie.community.models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    @OneToMany(mappedBy = "userProfile")
    private Set<AxieAccount> accounts = new HashSet<>();
}
