package com.com.github.afrikalimpopo.pet_teleboute.jrtb.command;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface Command {

    void execute(Update update);
}
