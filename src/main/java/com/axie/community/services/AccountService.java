package com.axie.community.services;

import com.axie.community.dtos.AccountDetailsDTO;
import com.axie.community.dtos.AxieAccountsDTO;
import com.axie.community.models.AxieAccount;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    AxieAccount createOrUpdateAccount(AxieAccount account);

    void deleteAccount(Long id);

    List<AxieAccount> getAllAccounts(Long id);

    Optional<AxieAccount> getAccountById(Long id);

    List<AccountDetailsDTO> getAccountsByUserId(Long id);

    AccountDetailsDTO getAccountDetailsFromMavis(AxieAccount account);
}
