package com.axie.community.controllers;

import com.axie.community.dtos.AccountDetailsDTO;
import com.axie.community.models.AxieAccount;
import com.axie.community.models.Player;
import com.axie.community.models.UserProfile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface UserProfileController {
    public ResponseEntity<UserProfile> createUserProfile(@RequestBody UserProfile profile);
    public ResponseEntity<UserProfile> getUserProfileById(@PathVariable Long id);
    public ResponseEntity<UserProfile> updateProfile(@RequestBody UserProfile profile);
    public ResponseEntity<String> deleteUser(@PathVariable Long id);
    public ResponseEntity<List<UserProfile>> getAllUserProfiles();
    public ResponseEntity<List<AccountDetailsDTO>> getAccountsByUserId(@PathVariable  Long id);
    public ResponseEntity<List<Player>> getPlayersByUserId(@PathVariable  Long id);



}
