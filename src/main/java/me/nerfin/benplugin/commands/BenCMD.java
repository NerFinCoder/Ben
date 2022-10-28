package me.nerfin.benplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BenCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        int index = (int) (Math.random() * 3);
        if (args[0].equals("null") || args[0].equals("")){
            return false;
        }
        if (index == 0){
            sender.sendMessage("§6§lBen§8 >> §aYes");
            return true;
        }
        else if (index == 1){
            sender.sendMessage("§6§lBen§8 >> §cNo");
            return true;
        }
        else if (index == 2){
            sender.sendMessage("§6§lBen§8 >> §eHo-ho-ho");
            return true;
        }
        return false;
    }
}
