package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;


public class NoCommand implements Command {

    private final SendBotMessageService sendBotMessageService;


    public static final String NO_MESSAGE = "Я поддерживаю команды, начинающиеся со слеша(/).\n"
            + "Чтобы посмотреть список команд введите /help";


    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;

    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.SendMassage(update.getMessage().getChatId().toString(), NO_MESSAGE);
    }
}
