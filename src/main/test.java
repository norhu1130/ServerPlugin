package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class test implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String string, String[] args) {
		if(sender instanceof Player)
		{
			Player p = (Player)sender;
			
		    if(args.length==0)
		    {
		    	p.sendMessage("Server�÷����� ������" );
		    }
		}
		else
		{
			sender.sendMessage("�ش�Ŀ�ǵ�� �ַܼ� ���Ұ����մϴ�.");
		}

		return false;
	}
}