package com.sample.tp;

import org.springframework.integration.Message;

public interface RecipeGateway {

    public String send(String message);
}
