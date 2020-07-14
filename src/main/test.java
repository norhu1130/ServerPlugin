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
		    	p.sendMessage("Server플러그인 동작중" );
		    }
		}
		else
		{
			sender.sendMessage("해당커맨드는 콘솔로 사용불가능합니다.");
		}

		return false;
	}
}