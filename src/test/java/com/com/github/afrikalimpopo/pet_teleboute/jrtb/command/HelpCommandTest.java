package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;
import org.junit.jupiter.api.DisplayName;

import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.CommandName.HELP;
import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.HelpCommand.HELP_MESSAGE;

@DisplayName("Unit-level testing for HelpCommands")
public class HelpCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return HELP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return HELP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new HelpCommand(sendBotMessageService);
    }
}
