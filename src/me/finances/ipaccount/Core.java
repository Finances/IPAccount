package me.finances.ipaccount;

import me.finances.ipaccount.file.ConfigHandler;
import me.finances.ipaccount.listeners.Login;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{
	
	public static Core plugin;
	
	public void onEnable(){
		
		plugin = this;
		
		saveDefaultConfig();
		ConfigHandler.load();
		
		getCommand("ip").setExecutor(new Commands());
		
		Bukkit.getPluginManager().registerEvents(new Login(), this);
		
	}
	
	public void onDisable(){
		
		ConfigHandler.save();
		
	}

}
