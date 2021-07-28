package com.axie.community.controllers;

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
    @GetMapping
    public List<AxieAccount> getAllAccounts() {
        return this.accountService.getAllAccounts(1L);
    }

    @Override
    @PostMapping
    public ResponseEntity<AxieAccount> createOrUpdateAccount(@RequestBody AxieAccount account) {
        return new ResponseEntity<>(this.accountService.createOrUpdateAccount(account), HttpStatus.CREATED);
    }
    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity<AxieAccount> getAccountById(@PathVariable Long id) {
        if (this.accountService.getAccountById(id).isPresent())
            return new ResponseEntity<>(this.accountService.getAccountById(id).get(), HttpStatus.OK);
        else return null;
    }

    @Override
    public ResponseEntity<String> deleteAccount(Long id) {
        return null;
    }

    @Override
    @PostMapping(value = "/{id}/claims")
    public ResponseEntity<Claim> saveClaim(@RequestBody  Claim claim, @PathVariable Long id) {
        return new ResponseEntity<>(this.claimService.createOrUpdateClaim(claim, id), HttpStatus.CREATED);
    }
}
