package com.telerikacademy.furniture.core.contracts;

import com.telerikacademy.furniture.commands.Command;

public interface CommandFactory {
    Command createCommandFromCommandName(String commandTypeAsString, FurnitureRepository furnitureRepository);
}
