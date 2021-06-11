package com.axie.community.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private int amount;

    @ManyToOne(cascade=CascadeType.ALL)
    private AxieAccount account;
}
