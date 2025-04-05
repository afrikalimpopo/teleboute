package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;


import org.junit.jupiter.api.DisplayName;

import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.CommandName.START;
import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.StartCommand.START_MESSAGE;

@DisplayName("Unit-level test for StartCommand")
public class StartCommandTest extends AbstractCommandTest {


    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
