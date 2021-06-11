package com.axie.community.controllers;

import com.axie.community.models.Claim;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/claims")
public class ClaimsControllerImpl implements ClaimsController{
    @Override
    public ResponseEntity<Claim> saveClaim(Claim claim, Long accountId) {
        return null;
    }
}
