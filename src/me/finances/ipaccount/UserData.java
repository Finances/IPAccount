package me.finances.ipaccount;

import me.finances.ipaccount.file.ConfigHandler;

import org.bukkit.entity.Player;

public class UserData {
	
	private Core plugin;
	private Player player;
	
	public UserData(Core pl, Player p){
		plugin = pl;
		player = p;
	}
	
	public String getIP(){
		 byte[] adress = player.getAddress().getAddress().getAddress();
		 String ip = adress.toString();
		 
		 return ip.replace("/", "");
	}
	
	public void logIP(String ip){
		
		ConfigHandler.UUIDMap.put(ip, null);
		
	}
	
	public void addUUIDs(){
		
		ConfigHandler.UUIDMap.get(getIP()).add(player.getUniqueId().toString());
		
	}

}
