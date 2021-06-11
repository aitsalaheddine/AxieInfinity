package com.axie.community.services;
import com.axie.community.dtos.AccountDetailsDTO;
import com.axie.community.models.AxieAccount;
import com.axie.community.repositories.AxieAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AxieAccountRepository axieAccountRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public AxieAccount updateOrUpdateAccount(AxieAccount account) {
        return this.axieAccountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        this.axieAccountRepository.deleteById(id);
    }

    @Override
    public List<AxieAccount> getAllAccounts() {
        return this.axieAccountRepository.findAll();
    }

    @Override
    public Optional<AxieAccount> getAccountById(Long id) {
        return this.axieAccountRepository.findById(id);
    }

    @Override
    public List<AccountDetailsDTO> getAccountsByUserId(Long id) {
        List<AccountDetailsDTO> accounts = new ArrayList<>();
        this.axieAccountRepository.findAxieAccountsByUserProfile_Id(id).forEach( account -> {
            AccountDetailsDTO accountDetailsDTO = getAccountDetailsFromMavis(account);
            accountDetailsDTO.setId(account.getId());
            accounts.add(accountDetailsDTO);
        });
        return accounts;
    }

    @Override
    public AccountDetailsDTO getAccountDetailsFromMavis(AxieAccount account) {
        return restTemplate.getForObject("https://lunacia.skymavis.com/game-api/clients/{accountId}/items/1",
                AccountDetailsDTO.class,
                account.getMetaMaskWallet()
        );
    }
}
