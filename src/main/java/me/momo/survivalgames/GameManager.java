package me.momo.survivalgames;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Copyright MOMOTHEREAL (c) 2014.
 */
public class GameManager {

    private SurvivalGames plugin;

    public GameManager(SurvivalGames plugin) {
        this.plugin = plugin;
    }

    public List<Player> getOnlinePlayers() {
        return Arrays.asList(Bukkit.getOnlinePlayers());
    }

    @Deprecated
    public boolean isOnline(String name) {
        return Bukkit.getPlayer(name).isOnline();
    }

    public boolean isOnline(UUID uuid) {
        return Bukkit.getPlayer(uuid).isOnline();
    }

}
