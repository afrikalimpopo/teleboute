package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;


public class StopCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public static final String STOP_MESSAGE = "deactivation all your subscr";

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update){
        sendBotMessageService.SendMassage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}
