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
	public void onEnable() { //Ȱ��ȭ
		
		consol.sendMessage( ChatColor.AQUA + "[ Server ] �÷����� Ȱ��ȭ �� �Ӵϴ�.");
		
		getServer().getPluginManager().registerEvents(this, this);
		com();
		
	}
	
	@Override
	public void onDisable() { //��Ȱ��ȭ
		
		consol.sendMessage( ChatColor.AQUA + "[ Server ] �÷����� ��Ȱ��ȭ �� �Ӵϴ�.");

	}
	
	@EventHandler
	public void join(PlayerJoinEvent e) { //����
		
		e.setJoinMessage(  ChatColor.GREEN + "[ Server ] ������ ȯ���մϴ�!"  );
		
	}
	public void com()
	{
		getCommand("server").setExecutor(new test());
	}
	
}
