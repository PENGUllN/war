package bukkit.tommytony.war.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bukkit.tommytony.war.War;
import bukkit.tommytony.war.WarCommandHandler;

import com.tommytony.war.Warzone;

public class TeamsCommand extends AbstractWarCommand {
	public TeamsCommand(WarCommandHandler handler, CommandSender sender, String[] args) {
		super(handler, sender, args);
	}

	public boolean handle() {
		Warzone zone;
		if (this.args.length == 1) {
			zone = War.war.getWarzoneFromName(this.args[0]);
		} else {
			if (!(this.sender instanceof Player)) {
				return false;
			}
			zone = War.war.getWarzoneFromLocation((Player) this.sender);
		}
		if (zone == null) {
			return true;
		}
//		zone.getTeams();
		return true;
	}
}