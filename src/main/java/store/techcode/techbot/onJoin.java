package store.techcode.techbot;

import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

import store.techcode.techbot.Main;

public class onJoin implements Listener {
    Main plugin;

    public onJoin(Main m) {
        plugin = m;
    }


    @EventHandler
    public void onPlayerJoin(AsyncPlayerPreLoginEvent e) {
//        String p = e.getName();

        String name = e.getName();
        UUID uuid = e.getUniqueId();


        if(!(e.getName().equals(plugin.getConfig().getString(uuid + ".name")))) {
            e.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, "§cAntyBot §7- §6Zostales zweryfikowany! \n§7Wejdz ponownie na serwer \n§7Wrazie problemów skontaktuj się z developerem pluginu lub administracja serwera §7Discord Dronojad#2298");
        }
        plugin.getConfig().set(uuid + ".name", name);
        plugin.saveConfig();

    }

}