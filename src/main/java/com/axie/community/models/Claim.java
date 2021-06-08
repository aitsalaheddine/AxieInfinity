package com.axie.community.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date date;
    private int amount;

    @ManyToOne
    @JoinColumn(name="account_id", nullable=false)
    private AxieAccount account;
}
