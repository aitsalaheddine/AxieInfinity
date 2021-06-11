package com.axie.community.controllers;

import com.axie.community.models.AxieAccount;
import com.axie.community.models.Claim;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ClaimsController {
    public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim, @PathVariable Long accountId);
}
