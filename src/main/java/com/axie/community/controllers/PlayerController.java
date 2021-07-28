package com.axie.community.controllers;

import com.axie.community.models.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PlayerController {

    public ResponseEntity<Player> getPlayerById(@PathVariable Long id);

    public ResponseEntity<Player> createOrUpdatePlayer(@RequestBody Player player);

    public ResponseEntity<String> deletePlayer(@PathVariable Long id);

}
