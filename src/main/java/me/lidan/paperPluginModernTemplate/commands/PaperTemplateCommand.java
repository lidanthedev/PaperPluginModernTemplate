package me.lidan.paperPluginModernTemplate.commands;

import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Subcommand;

@Command("papertemplate")
public class PaperTemplateCommand {
    @Subcommand("hello")
    public void hello(CommandSender sender) {
        sender.sendMessage("Hello World!");
    }
}
