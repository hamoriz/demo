package com.micro.service2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Zoltan_Hamori on 2/22/2017.
 */
@Service
public class NumberService {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Value("${services.service1.link}")
    private String serviceLink;

    public Integer getNumber() {
        try {
           RestTemplate restTemplate = restTemplateBuilder.build();
           return  restTemplate.getForObject(new URI(serviceLink), Integer.class);
        } catch (URISyntaxException e) {
            throw new RuntimeException("Invalid setup",e);
        }
    }
}
