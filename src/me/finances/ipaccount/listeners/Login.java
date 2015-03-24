package me.finances.ipaccount.listeners;

import me.finances.ipaccount.Core;
import me.finances.ipaccount.UserData;
import me.finances.ipaccount.file.ConfigHandler;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Login implements Listener{
	
	@EventHandler
	public void join(PlayerJoinEvent e){
		
		UserData UD = new UserData(Core.plugin, e.getPlayer());
		
		if(!ConfigHandler.UUIDMap.containsKey(UD.getIP())){
			UD.logIP(UD.getIP());
		}else{
			UD.addUUIDs();
		}
		
	}

}
