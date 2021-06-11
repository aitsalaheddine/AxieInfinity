package com.axie.community.services;

import com.axie.community.models.AxieAccount;
import com.axie.community.models.Claim;

import java.util.List;
import java.util.Optional;

public interface ClaimService {
    public Claim createOrUpdateClaim(Claim claim, Long accountId);

    public void deleteClaim(Long id);

    public List<Claim> getAllClaims();

    public Optional<Claim> getClaimById(Long id);

    public List<Claim> getClaimsByAccountId(Long id);
}
