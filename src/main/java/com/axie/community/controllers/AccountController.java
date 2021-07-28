package com.axie.community.controllers;

import com.axie.community.dtos.AxieAccountsDTO;
import com.axie.community.models.AxieAccount;
import com.axie.community.models.Claim;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AccountController {
    public List<AxieAccount> getAllAccounts();

    public ResponseEntity<AxieAccount> getAccountById(@PathVariable Long id);

    public ResponseEntity<AxieAccount> createOrUpdateAccount(@RequestBody AxieAccount account);

    public ResponseEntity<String> deleteAccount(@PathVariable Long id);

    public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim, @PathVariable Long accountId);

}
