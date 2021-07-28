package com.axie.community.controllers;

import com.axie.community.models.Player;
import com.axie.community.repositories.PlayerRepository;
import com.axie.community.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/players")
public class PlayerControllerImpl implements PlayerController{

    @Autowired
    PlayerService playerService;

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable  Long id) {
        return new ResponseEntity<>(this.playerService.getPlayerById(id).get(), HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<Player> createOrUpdatePlayer(@RequestBody Player player) {
        return new ResponseEntity<>(this.playerService.createOrUpdatePlayer(player), HttpStatus.OK);
    }

    @Override
    @DeleteMapping
    public ResponseEntity<String> deletePlayer(Long id) {
        this.playerService.deletePlayer(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }
}
