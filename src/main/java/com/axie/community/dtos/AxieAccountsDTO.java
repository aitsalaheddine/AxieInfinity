package com.axie.community.dtos;

import com.axie.community.models.AxieAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data @AllArgsConstructor
public class AxieAccountsDTO {
    private Set<AccountDetailsDTO> accounts = new HashSet<>();
    private Long userProfile;

    public AxieAccountsDTO() {}
}
