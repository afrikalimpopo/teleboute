package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;


import org.junit.jupiter.api.DisplayName;

import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.CommandName.STOP;
import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.StopCommand.STOP_MESSAGE;


@DisplayName("Unit-level test for StopCommand")
public class StopCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
