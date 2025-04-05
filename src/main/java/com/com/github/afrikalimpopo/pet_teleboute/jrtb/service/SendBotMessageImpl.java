package com.com.github.afrikalimpopo.pet_teleboute.jrtb.service;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.bot.TelebouteBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageImpl implements SendBotMessageService {

    private final TelebouteBot telebouteBot;

    @Autowired
    public SendBotMessageImpl(TelebouteBot telebouteBot){
        this.telebouteBot = telebouteBot;
    }

    @Override
    public void SendMassage(String chatId, String massage) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(massage);

        try{
            telebouteBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
