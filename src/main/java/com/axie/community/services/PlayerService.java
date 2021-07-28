package com.axie.community.services;

import com.axie.community.models.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    public Player createOrUpdatePlayer(Player player);

    public void deletePlayer(Long id);

    public Optional<Player> getPlayerById(Long id);

    public List<Player> getPlayersByUserId(Long id);

}
