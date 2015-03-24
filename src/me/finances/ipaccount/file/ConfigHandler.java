package me.finances.ipaccount.file;

import java.util.HashMap;
import java.util.List;

import me.finances.ipaccount.Core;

public class ConfigHandler {
	
	private static Core plugin = Core.plugin;
	
	public static HashMap<String, List<String>> UUIDMap = new HashMap<String, List<String>>();
	
	public static void save(){
		
		for(String s : UUIDMap.keySet()){
			
			plugin.getConfig().set("ip."+s, UUIDMap.get(s));
			
		}
		
		plugin.saveConfig();
		
	}
	
	@SuppressWarnings("unchecked")
	public static void load(){
		
		if(!plugin.getConfig().contains("ip")) return;
		
		for(String s : plugin.getConfig().getConfigurationSection("ip").getKeys(false)){
			
			UUIDMap.put(s, (List<String>) plugin.getConfig().getList("ip."+s));
			
		}
		
	}

}
