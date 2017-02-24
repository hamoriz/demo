package com.micro.service1.controller;

import org.springframework.stereotype.Component;

/**
 * Created by Zoltan_Hamori on 2/23/2017.
 */
@Component
public class SampleBean {

    public String getHello(String name) {
        return "hello "+name;
    }
}
