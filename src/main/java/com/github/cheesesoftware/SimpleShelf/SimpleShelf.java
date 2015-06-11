package com.github.cheesesoftware.SimpleShelf;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleShelf extends JavaPlugin implements Listener  {
    
    public void onEnable() {
	getServer().getPluginManager().registerEvents(this, this);
    }
}
