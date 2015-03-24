package me.finances.ipaccount;

import me.finances.ipaccount.file.ConfigHandler;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		
		Player player = (Player)sender;
		
		if(commandLabel.equalsIgnoreCase("ip")){
			if(args.length==0){
				player.sendMessage(ChatColor.RED+"Usage: /ip <args...>");
			}else if(args[0].equalsIgnoreCase("debug")){
				player.sendMessage(ConfigHandler.UUIDMap.toString());
			}
		}
		return false;
		
		
	}

}
