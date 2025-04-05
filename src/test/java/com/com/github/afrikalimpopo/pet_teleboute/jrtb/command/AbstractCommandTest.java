package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.bot.TelebouteBot;
import com.com.github.afrikalimpopo.pet_teleboute.jrtb.service.SendBotMessageImpl;
import com.com.github.afrikalimpopo.pet_teleboute.jrtb.service.SendBotMessageService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

abstract class AbstractCommandTest {


    protected TelebouteBot telebouteBot = Mockito.mock(TelebouteBot.class);
    protected SendBotMessageService sendBotMessageService = new SendBotMessageImpl(telebouteBot);

    abstract String getCommandName();
    abstract String getCommandMessage();
    abstract Command getCommand();

    @Test
    public void shouldProperlyExecuteCommand() throws TelegramApiException{
        Long chatId = 1234567824356L;

        Update update = new Update();
        Message message = Mockito.mock(Message.class);
        Mockito.when(message.getChatId()).thenReturn(chatId);
        Mockito.when(message.getText()).thenReturn(getCommandName());
        update.setMessage(message);

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(getCommandMessage());
        sendMessage.enableHtml(true);

        getCommand().execute(update);

        Mockito.verify(telebouteBot).execute(sendMessage);

    }


}
