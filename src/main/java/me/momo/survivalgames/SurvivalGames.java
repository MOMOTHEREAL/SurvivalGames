package me.momo.survivalgames;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Copyright MOMOTHEREAL (c) 2014.
 */
public class SurvivalGames extends JavaPlugin {

    private static SurvivalGames plugin; //The instance of the plugin
    private GameManager gameManager;
    private Logger logger;

    @Override
    public void onLoad() {
        plugin = this;
        gameManager = new GameManager(this);
        logger = this.getLogger();
        logger.log(Level.INFO, "SurvivalGames has been loaded.");
    }

    /**
     * Enabling the plugin
     */
    @Override
    public void onEnable() {

        logger.log(Level.INFO, "SurvivalGames has been enabled.");
    }


    /**
     * Disabling the plugin
     */
    @Override
    public void onDisable() {
        logger.log(Level.INFO, "SurvivalGames has been disabled.");
    }


    /**
     * The instance of the plugin
     */
    public static SurvivalGames getPlugin() {
        return plugin;
    }

    public GameManager getGameManager() {
        return gameManager;
    }
}
