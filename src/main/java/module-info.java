import net.milkbowl.vault.plugin.VaultPlugin;
import org.bukkit.plugin.LaunchablePlugin;

module net.milkbowl.vault {
    requires transitive org.bukkit;
    exports net.milkbowl.vault.chat;
    exports net.milkbowl.vault.economy;
    exports net.milkbowl.vault.permission;
    provides LaunchablePlugin with VaultPlugin;
}