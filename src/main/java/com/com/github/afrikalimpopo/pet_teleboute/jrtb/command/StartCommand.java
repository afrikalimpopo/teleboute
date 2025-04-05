package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.service.SendBotMessageService;
import  org.telegram.telegrambots.meta.api.objects.Update;


public class StartCommand implements Command{

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "ya bot poka ne znayu chto mogu delat";


    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.SendMassage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
