package me.nerfin.benplugin;

import me.nerfin.benplugin.commands.BenCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin created by NerFin");
        getCommand("ben").setExecutor(new BenCMD());

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin created by NerFin");
    }
}
