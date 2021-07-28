package com.axie.community.repositories;

import com.axie.community.models.AxieAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AxieAccountRepository extends JpaRepository<AxieAccount, Long> {
    public List<AxieAccount> findAxieAccountsByUserProfile_Id(Long id);
}
