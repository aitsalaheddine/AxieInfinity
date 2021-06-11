package com.axie.community.repositories;

import com.axie.community.models.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ClaimRepository extends JpaRepository<Claim, Long>{
    public List<Claim> findClaimsByAccount_Id(Long id);
}
