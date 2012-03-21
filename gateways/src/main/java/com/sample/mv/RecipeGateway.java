package com.sample.mv;

import org.springframework.integration.Message;

public interface RecipeGateway {

    public Message<String> sendTo(Message<String> message);

    public String send(String message);
}
