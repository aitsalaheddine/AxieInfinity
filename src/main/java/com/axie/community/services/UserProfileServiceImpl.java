package com.axie.community.services;

import com.axie.community.models.AxieAccount;
import com.axie.community.models.UserProfile;
import com.axie.community.repositories.AxieAccountRepository;
import com.axie.community.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    public UserProfileRepository userProfileRepository;

    @Autowired
    public AxieAccountRepository axieAccountRepository;

    @Override
    public UserProfile createOrUpdateProfile(UserProfile profile) {
        profile.getAccounts().stream().forEach( account -> {
            account.setUserProfile( profile );
        } );
        return this.userProfileRepository.save(profile);
    }

    @Override
    public void deleteUser(Long id) {
        this.userProfileRepository.deleteById(id);
    }

    @Override
    public List<UserProfile> getAllUserProfiles() {
        return this.userProfileRepository.findAll();
    }

    @Override
    public Optional<UserProfile> getUserProfileById(Long id) {
        return this.userProfileRepository.findById(id);
    }
}
