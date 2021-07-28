package com.axie.community.services;

import com.axie.community.models.Player;
import com.axie.community.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    PlayerRepository playerRepository;


    @Override
    public Player createOrUpdatePlayer(Player player) {
        return this.playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Long id) {
        this.playerRepository.deleteById(id);
    }

    @Override
    public Optional<Player> getPlayerById(Long id) {
        return this.playerRepository.findById(id);
    }

    @Override
    public List<Player> getPlayersByUserId(Long id) {
        return this.playerRepository.findByAccountUserProfile_Id(id);
    }
}
