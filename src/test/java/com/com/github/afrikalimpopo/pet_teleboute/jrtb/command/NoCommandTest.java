package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;


import org.junit.jupiter.api.DisplayName;

import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.CommandName.NO;
import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.NoCommand.NO_MESSAGE;

@DisplayName("Unit-level test for NoCommand")
public class NoCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
