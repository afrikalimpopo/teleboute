package com.com.github.afrikalimpopo.pet_teleboute.jrtb.service;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.bot.TelebouteBot;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


@DisplayName("Unit-level testing for SendBotMessageService")
public class SendBotMessageServiceTest {

    private SendBotMessageService sendBotMessageService;
    private TelebouteBot telebouteBot;

    @BeforeEach
    public void init(){
        telebouteBot = Mockito.mock(TelebouteBot.class);
        sendBotMessageService = new SendBotMessageImpl(telebouteBot);
    }

    @Test
    public void shouldProperlySendMessage() throws TelegramApiException{
        String chatId = "test_chat_id";
        String message = "test_message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(message);
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);

        sendBotMessageService.SendMassage(chatId, message);

        Mockito.verify(telebouteBot).execute(sendMessage);
    }


}
