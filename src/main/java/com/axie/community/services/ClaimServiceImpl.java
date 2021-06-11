package com.axie.community.services;

import com.axie.community.models.Claim;
import com.axie.community.repositories.AxieAccountRepository;
import com.axie.community.repositories.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService {
    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private AxieAccountRepository accountRepository;

    @Override
    public Claim createOrUpdateClaim(Claim claim, Long accountId) {
        claim.setAccount(accountRepository.getById(accountId));
        return this.claimRepository.save(claim);
    }

    @Override
    public void deleteClaim(Long id) {
        this.claimRepository.deleteById(id);
    }

    @Override
    public List<Claim> getAllClaims() {
        return this.claimRepository.findAll();
    }

    @Override
    public Optional<Claim> getClaimById(Long id) {
        return this.claimRepository.findById(id);
    }

    @Override
    public List<Claim> getClaimsByAccountId(Long id) {
        return this.claimRepository.findClaimsByAccount_Id(id);
    }
}
