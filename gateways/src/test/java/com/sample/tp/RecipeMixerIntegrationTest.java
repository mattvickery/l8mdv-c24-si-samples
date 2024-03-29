package com.sample.tp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {"classpath:META-INF/spring/tp/gateways-context.xml"}
)
public class RecipeMixerIntegrationTest {

    @Autowired
    RecipeGateway recipeGateway;

    @Test
    public void simpleMessage()
    {
        String response = recipeGateway.send("sultanas, flour");
        //Assert.assertEquals(response, RecipeMixer.mixed);
        System.out.println(response);
    }

    @Autowired
    SecondGateway secondGateway;

    @Test
    public void secondMessage()
    {
        String response2 = secondGateway.send("sultanas, flour");
        //Assert.assertEquals(response, RecipeMixer.mixed);
        System.out.println(response2);

    }
}
