package main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	ConsoleCommandSender consol = Bukkit.getConsoleSender();
	
	@Override
	public void onEnable() { //활성화
		
		consol.sendMessage( ChatColor.AQUA + "[ Server ] 플러그인 활성화 중 입니다.");
		
		getServer().getPluginManager().registerEvents(this, this);
		
	}
	
	@Override
	public void onDisable() { //비활성화
		
		consol.sendMessage( ChatColor.AQUA + "[ Server ] 플러그인 비활성화 중 입니다.");

	}
	
	@EventHandler
	public void join(PlayerJoinEvent e) { //참여
		
		e.setJoinMessage(  ChatColor.GREEN + "[ Server ] 접속을 환영합니다!"  );
		
	}
	
}
