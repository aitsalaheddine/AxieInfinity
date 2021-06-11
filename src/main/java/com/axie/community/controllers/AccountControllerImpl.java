package com.axie.community.controllers;

import com.axie.community.dtos.AxieAccountsDTO;
import com.axie.community.models.AxieAccount;
import com.axie.community.models.Claim;
import com.axie.community.services.AccountService;
import com.axie.community.services.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/accounts")
public class AccountControllerImpl implements AccountController{

    @Autowired
    private AccountService accountService;

    @Autowired
    private ClaimService claimService;

    @Override
    @GetMapping("/")
    public List<AxieAccount> getAllAccounts() {
        return this.accountService.getAllAccounts();
    }

    @Override
    public ResponseEntity<AxieAccount> getAccountById(Long id) {
       return new ResponseEntity<>(this.accountService.getAccountById(id).get(), HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<AxieAccount> createAccount(AxieAccountsDTO axieAccountsDTO) {
        return null;
    }

    @Override
    public ResponseEntity<String> updateAccount(AxieAccount account) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteAccount(Long id) {
        return null;
    }

    @Override
    @PostMapping(value = "/{id}/claims")
    public ResponseEntity<Claim> saveClaim(@RequestBody  Claim claim, @PathVariable Long accountId) {
        return new ResponseEntity<>(this.claimService.createOrUpdateClaim(claim, accountId), HttpStatus.CREATED);
    }
}
