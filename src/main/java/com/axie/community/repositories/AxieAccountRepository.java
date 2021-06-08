package com.axie.community.repositories;

import com.axie.community.models.AxieAccount;
import com.axie.community.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AxieAccountRepository extends JpaRepository<AxieAccount, Integer> {
}
