package com.axie.community.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class AxieAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String roninWallet;
    private String metaMaskWallet;

    @OneToOne(mappedBy = "account")
    private Player player;

    @OneToMany(mappedBy = "account")
    private Set<Claim> claims = new HashSet<>();

    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL)
    private UserProfile userProfile;
}
