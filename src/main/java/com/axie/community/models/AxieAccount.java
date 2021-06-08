package com.axie.community.models;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class AxieAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String roninWallet;
    private String metaMaskWallet;

    @OneToOne(mappedBy = "account")
    private Player player;

    @OneToMany(mappedBy = "account")
    private Set<Claim> claims = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private UserProfile userProfile;
}
