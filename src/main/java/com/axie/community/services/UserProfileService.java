package com.axie.community.services;

import com.axie.community.dtos.AxieAccountsDTO;
import com.axie.community.models.AxieAccount;
import com.axie.community.models.UserProfile;

import java.util.List;
import java.util.Optional;

public interface UserProfileService {

    public UserProfile createOrUpdateProfile(UserProfile profile);

    public void deleteUser(Long id);

    public List<UserProfile> getAllUserProfiles();

    public Optional<UserProfile> getUserProfileById(Long id);
}
