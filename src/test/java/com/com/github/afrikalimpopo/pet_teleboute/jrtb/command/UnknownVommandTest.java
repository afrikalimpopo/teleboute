package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;


import org.junit.jupiter.api.DisplayName;

import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Unit-level test for UnknownCommand")
public class UnknownVommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return "/sdfafasdaf";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
