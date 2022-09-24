package store.techcode.techbot;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import store.techcode.techbot.onJoin;

public class Main extends JavaPlugin {

    public static Main main;

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("------------------ \n \n \n AntyBot sie wlacza \n Developer Dronojad#2298 \n Discord: https://discord.gg/dxCGTvSEFj \n Strona: techcode.store \n \n \n ------------------");
        getConfig().options().copyDefaults(true);
        saveConfig();

        main = this;

        getServer().getPluginManager().registerEvents(new onJoin(this), this);
    }

    public static Main getMain() {
        return main;
    }


    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("------------------ \n \n \n AntyBot wylaczony poprawie \n Developer Dronojad#2298 \n Discord: https://discord.gg/dxCGTvSEFj \n Strona: techcode.store \n \n \n ------------------");
        saveConfig();
    }


}

