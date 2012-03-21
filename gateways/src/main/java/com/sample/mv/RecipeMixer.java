package com.sample.mv;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RecipeMixer {

    public static String mixed = "cake";

    public String service(String message) {

        Assert.notNull(message, "Mandatory argument missing.");

        StringTokenizer tokenizer = new StringTokenizer(message);
        List<String> list = new ArrayList<String>();
        while(tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }

        Assert.state(list.size() == 2);
        return mixed;
    }

}
