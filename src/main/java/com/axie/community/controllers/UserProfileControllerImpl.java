package com.axie.community.controllers;

import com.axie.community.dtos.AccountDetailsDTO;
import com.axie.community.models.AxieAccount;
import com.axie.community.models.Player;
import com.axie.community.models.UserProfile;
import com.axie.community.repositories.AxieAccountRepository;
import com.axie.community.services.AccountService;
import com.axie.community.services.PlayerService;
import com.axie.community.services.UserProfileService;
import javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserProfileControllerImpl implements UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private PlayerService playerService;

    @Override
    @GetMapping("/")
    public ResponseEntity<List<UserProfile>> getAllUserProfiles() {
        return new ResponseEntity<>(this.userProfileService.getAllUserProfiles(), HttpStatus.FOUND);
    }

    @Override
    @PostMapping
    public ResponseEntity<UserProfile> createUserProfile(UserProfile profile) {
        return new ResponseEntity<>(this.userProfileService.createOrUpdateProfile(profile), HttpStatus.CREATED);
    }

    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserProfile> getUserProfileById(@PathVariable Long id) {
        return new ResponseEntity<>(this.userProfileService.getUserProfileById(id).get(), HttpStatus.FOUND);
    }

    @Override
    @GetMapping(value = "/{id}/accounts")
    public ResponseEntity<List<AccountDetailsDTO>> getAccountsByUserId(@PathVariable Long id) {
        return new ResponseEntity<>(this.accountService.getAccountsByUserId(id), HttpStatus.ACCEPTED);
    }

    @Override
    @GetMapping(value = "/{id}/players")
    public ResponseEntity<List<Player>> getPlayersByUserId(@PathVariable Long id) {
        return new ResponseEntity<>(this.playerService.getPlayersByUserId(id), HttpStatus.OK);
    }

    @Override
    @PutMapping
    public ResponseEntity<UserProfile> updateProfile(@RequestBody UserProfile profile) {
        return new ResponseEntity<>(this.userProfileService.createOrUpdateProfile(profile), HttpStatus.CONTINUE);
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        this.userProfileService.deleteUser(id);
        return new ResponseEntity<>("Deleted", HttpStatus.ACCEPTED);
    }
}
