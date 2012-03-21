package com.sample.mv;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"classpath:META-INF/spring/mv/gateways-context.xml"}
)
public class RecipeMixerIntegrationTest {

    @Autowired RecipeGateway recipeGateway;

    @Test
    public void simpleMessage() {

        String response = recipeGateway.send("sultanas, flour");
        Assert.assertEquals(response, RecipeMixer.mixed);
    }

}
