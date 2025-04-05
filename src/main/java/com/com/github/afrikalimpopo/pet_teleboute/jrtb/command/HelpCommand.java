package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.CommandName.*;


public class HelpCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("✨<b>Дотупные команды</b>✨\n\n"

                    + "<b>Начать\\закончить работу с ботом</b>\n"
                    + "%s - начать работу со мной\n"
                    + "%s - приостановить работу со мной\n\n"
                    + "%s - получить помощь в работе со мной\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.SendMassage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
