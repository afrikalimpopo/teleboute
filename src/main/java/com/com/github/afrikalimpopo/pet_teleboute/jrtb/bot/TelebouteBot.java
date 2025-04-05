package com.com.github.afrikalimpopo.pet_teleboute.jrtb.bot;

import com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.CommandContainer;
import com.com.github.afrikalimpopo.pet_teleboute.jrtb.service.SendBotMessageImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import static com.com.github.afrikalimpopo.pet_teleboute.jrtb.command.CommandName.NO;

@Component
public class TelebouteBot extends TelegramLongPollingBot {

    public static String COMMAND_PREFIX = "/";

    @Value("${bot.username}")
    private String username;

    @Value("${bot.token}")
    private String token;

    private final CommandContainer commandContainer;

    public TelebouteBot(){
        this.commandContainer = new CommandContainer(new SendBotMessageImpl(this));
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message = update.getMessage().getText().trim();
            if (message.startsWith(COMMAND_PREFIX)) {
                String commandIdentifier = message.split(" ")[0].toLowerCase();

                commandContainer.retrieveCommand(commandIdentifier).execute(update);

            } else {
                commandContainer.retrieveCommand(NO.getCommandName()).execute(update);

            }
        }
    }

    @Override
    public String getBotUsername(){
        return username;
    }

    @Override
    public String getBotToken(){
        return token;
    }

}
