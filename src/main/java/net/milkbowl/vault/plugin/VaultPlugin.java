package net.milkbowl.vault.plugin;

import org.bukkit.plugin.LaunchablePlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.util.Optional;

public final class VaultPlugin implements LaunchablePlugin {
    @Override
    public void onLaunch(Plugin plugin, Path dataFolder) {
        LoggerFactory.getLogger(getClass()).info("Starting provisional Vault API packaged as a plugin");
    }

    @Override
    public void onEnable() {

    }

    @Override
    public Optional<PluginDescriptionFile> getDescription() {
        String version = getClass().getModule().getDescriptor().version().orElseThrow().toString();
        return Optional.of(new PluginDescriptionFile("Vault", version, getClass().getName()));
    }

    @Override
    public void close() {

    }
}
