package com.axie.community.repositories;

import com.axie.community.models.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClaimRepository extends JpaRepository<Claim, Integer>{
}
